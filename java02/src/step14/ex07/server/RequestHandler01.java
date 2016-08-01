//1단계: 요청을 처리하는 코드를 별도의 메서드로 분리하여 관리
package step14.ex07.server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

import step14.ex07.vo.Board;

class RequestHandler01 extends Thread {
  BoardDaoImpl boardDao;
  Socket socket;
  
  public void setBoardDao(BoardDaoImpl boardDao) {
    this.boardDao = boardDao;
  }
  
  public void setSocket(Socket socket) {
    this.socket = socket;
  }

  @Override
  public void run() {
    try (
      ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
      ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
    ) {
      Map<String,String> paramMap = parseCommand(in.readUTF());
      
      if (paramMap.get("path").equals("/board/list.do")) {
        boardList(out);
        
      } else if (paramMap.get("path").equals("/board/detail.do")) {
        boardDetail(out, paramMap);
        
      } else if (paramMap.get("path").equals("/board/auth.do")) {
        boardAuth(out, paramMap);
      
      } else if (paramMap.get("path").equals("/board/delete.do")) {
        boardDelete(out, paramMap);
        
      } else if (paramMap.get("path").equals("/board/update.do")) {
        boardUpdate(out, paramMap);
      
      } else if (paramMap.get("path").equals("/board/add.do")) {
        boardAdd(out, paramMap);
      
      } else {
        error(out);
      }
      out.flush(); // 소켓 내부의 버퍼에 출력된 값을 클라이언트로 방출한다.
      
    } catch (Exception e) {
      System.out.println("클라이언트 요청을 처리하는 중에 오류 발생!");
      e.printStackTrace();
      
    } finally {
      try {socket.close();} catch (Exception e) {}
    }
  }

  private void error(ObjectOutputStream out) throws IOException {
    out.writeObject(new Exception("해당 명령을 지원하지 않습니다."));
  }

  private void boardAdd(ObjectOutputStream out, Map<String, String> paramMap) throws IOException, Exception {
    Board board = new Board();
    board.setPassword(paramMap.get("password"));
    board.setTitle(paramMap.get("title"));
    board.setContents(paramMap.get("contents"));
    
    out.writeObject(boardDao.insert(board));
  }

  private void boardUpdate(ObjectOutputStream out, Map<String, String> paramMap) throws IOException, Exception {
    Board board = new Board();
    board.setNo(Integer.parseInt(paramMap.get("no")));
    board.setTitle(paramMap.get("title"));
    board.setContents(paramMap.get("contents"));
    
    out.writeObject(boardDao.update(board));
  }

  private void boardDelete(ObjectOutputStream out, Map<String, String> paramMap) throws IOException, Exception {
    int no = Integer.parseInt(paramMap.get("no"));
    out.writeObject(boardDao.delete(no));
  }

  private void boardAuth(ObjectOutputStream out, Map<String, String> paramMap) throws IOException, Exception {
    int no = Integer.parseInt(paramMap.get("no"));
    String password = paramMap.get("password");
    out.writeObject(boardDao.selectOne(no, password));
  }

  private void boardDetail(ObjectOutputStream out, Map<String, String> paramMap) throws IOException, Exception {
    int no = Integer.parseInt(paramMap.get("no"));
    out.writeObject(boardDao.selectOne(no));
  }

  private void boardList(ObjectOutputStream out) throws IOException, Exception {
    out.writeObject(boardDao.selectList());
  }

  private Map<String, String> parseCommand(String command) {
    HashMap<String,String> map = new HashMap<>();
    
    String[] arr = command.split("\\?");
    map.put("path", arr[0]);
    
    String[] params;
    if (arr.length > 1) {
      params = arr[1].split("&");
      String[] values;
      for (String param : params) {
        values = param.split("=");
        map.put(values[0], values[1]);
      }
    }
    
    return map;
  }
  
}






