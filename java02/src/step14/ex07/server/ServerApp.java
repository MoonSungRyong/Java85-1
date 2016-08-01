package step14.ex07.server;

import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;

public class ServerApp {
  BoardDaoImpl boardDao;
  
  public ServerApp() throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/java85db", "java85", "1111"); 
    
    boardDao = new BoardDaoImpl();
    boardDao.setConnection(con);  
  }
  
  private void execute() throws Exception {
    ServerSocket serverSocket = new ServerSocket(8888);
    System.out.println("서버 실행 중...");
    
    Socket socket;
    RequestHandler handler;
    
    while (true) {
      socket = serverSocket.accept();

      handler = new RequestHandler();
      handler.setSocket(socket);
      handler.setBoardDao(boardDao);
      handler.start();
    }
    
  }
  
  public static void main(String[] args) {
    try {
      ServerApp server = new ServerApp();
      server.execute();
      
    } catch (Exception e) {
      System.out.println("서버 실행 중에 오류 발생!");
      e.printStackTrace();
    }
  }

}
  
  
  
  
  
  
  
  
