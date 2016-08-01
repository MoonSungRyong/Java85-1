package step14.ex08.server;

import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;

import step14.ex08.server.command.BoardAddCommand;
import step14.ex08.server.command.BoardAuthCommand;
import step14.ex08.server.command.BoardDeleteCommand;
import step14.ex08.server.command.BoardDetailCommand;
import step14.ex08.server.command.BoardListCommand;
import step14.ex08.server.command.BoardUpdateCommand;
import step14.ex08.server.command.ErrorCommand;

public class ServerApp {
  BoardDaoImpl boardDao;
  Map<String,Command> commandMap;
  
  public ServerApp() throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/java85db", "java85", "1111"); 
    
    boardDao = new BoardDaoImpl();
    boardDao.setConnection(con); 
    
    commandMap = new HashMap<>();
    
    BoardListCommand boardListCommand = new BoardListCommand();
    boardListCommand.setBoardDao(boardDao);
    commandMap.put("/board/list.do", boardListCommand);
    
    BoardAddCommand boardAddCommand = new BoardAddCommand();
    boardAddCommand.setBoardDao(boardDao);
    commandMap.put("/board/add.do", boardAddCommand);
    
    BoardUpdateCommand boardUpdateCommand = new BoardUpdateCommand();
    boardUpdateCommand.setBoardDao(boardDao);
    commandMap.put("/board/update.do", boardUpdateCommand);
    
    BoardDeleteCommand boardDeleteCommand = new BoardDeleteCommand();
    boardDeleteCommand.setBoardDao(boardDao);
    commandMap.put("/board/delete.do", boardDeleteCommand);
    
    BoardDetailCommand boardDetailCommand = new BoardDetailCommand();
    boardDetailCommand.setBoardDao(boardDao);
    commandMap.put("/board/detail.do", boardDetailCommand);
    
    BoardAuthCommand boardAuthCommand = new BoardAuthCommand();
    boardAuthCommand.setBoardDao(boardDao);
    commandMap.put("/board/auth.do", boardAuthCommand);
    
    ErrorCommand errorCommand = new ErrorCommand();
    commandMap.put("error", errorCommand);
  }
  
  private void execute() throws Exception {
    ServerSocket serverSocket = new ServerSocket(8888);
    System.out.println("서버 실행 중...");
    
    Socket socket;
    RequestHandler handler;
    
    while (true) {
      socket = serverSocket.accept();

      handler = new RequestHandler();
      handler.setSocket(socket); // 클라이언트와 통신할 소켓을 주입하고,
      handler.setCommandMap(commandMap); // 명령어 처리 객체가 들어있는 맵을 전달한다.
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
  
  
  
  
  
  
  
  
