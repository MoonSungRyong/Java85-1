package client;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

import server.BoardDao;
import vo.Board;

public class BoardDaoProxy implements BoardDao {
  String serverAddr;
  int port;

  public BoardDaoProxy(String serverAddr, int port) {
    this.serverAddr = serverAddr;
    this.port = port;
  }
  
  private Object send(String command) throws Exception {
    try (
      Socket socket = new Socket(this.serverAddr, this.port);
      ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
      ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
    ) {
      out.writeUTF(command);
      out.flush();
      
      Object result = in.readObject();
      if (result instanceof Exception) {
        throw (Exception)result;
      }
      
      return result;
    } 
  }

  @Override
  public int insert(Board board) throws Exception {
    return (Integer)send("/board/add.do?password=" + board.getPassword() +
        "&title=" + board.getTitle() + "&contents=" + board.getContents());
  }

  @Override
  public List<Board> selectList(int pageNo, int length) throws Exception {
    return (List<Board>) send("/board/list.do?pageNo=" + pageNo + "&length=" + length);
  }

  @Override
  public Board selectOne(int no) throws Exception {
    return (Board)send("/board/detail.do?no=" + no);
  }

  @Override
  public Board selectOne(int no, String password) throws Exception {
    // => "/board/auth.do?no=9&password=1111"
    return (Board)send("/board/auth.do?no=" + no + "&password=" + password);
  }

  @Override
  public int update(Board board) throws Exception {
    return (Integer)send("/board/update.do?no=" + board.getNo() +
        "&title=" + board.getTitle() + "&contents=" + board.getContents());
  }

  @Override
  public int delete(int no) throws Exception {
    return (Integer)send("/board/delete.do?no=" + no);
  }

}









