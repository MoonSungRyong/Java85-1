package step14.ex05.server;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class BoardServer {
  BoardDao boardDao;
  
  public BoardServer() throws Exception {
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
    while (true) {
      socket = serverSocket.accept();
      new RequestHandler(socket).start(); 
    }
    
  }
  
  public static void main(String[] args) {
    try {
      BoardServer server = new BoardServer();
      server.execute();
      
    } catch (Exception e) {
      System.out.println("서버 실행 중에 오류 발생!");
      e.printStackTrace();
    }
  }

}
  
  
  
  
  
  
  
  
