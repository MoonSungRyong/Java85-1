package step14.ex05.server;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

class RequestHandler extends Thread {
  BoardDao boardDao;
  Socket socket;
  
  public void setBoardDao(BoardDao boardDao) {
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
      String command = in.readUTF();
      
      if (command.equals("/board/list.do")) {
        out.writeObject(boardDao.selectList());
      } else {
        out.writeObject("해당 명령을 지원하지 않습니다.");
      }
      out.flush(); // 소켓 내부의 버퍼에 출력된 값을 클라이언트로 방출한다.
      
    } catch (Exception e) {
      System.out.println("클라이언트 요청을 처리하는 중에 오류 발생!");
      
    } finally {
      try {socket.close();} catch (Exception e) {}
    }
  }
}








