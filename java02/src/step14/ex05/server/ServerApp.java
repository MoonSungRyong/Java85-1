package step14.ex05.server;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class ServerApp {
  BoardDao boardDao;
  
  public ServerApp() throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/java85db", "java85", "1111"); 
    
    boardDao = new BoardDao();
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
  
  
  
  
  
  
  
  
