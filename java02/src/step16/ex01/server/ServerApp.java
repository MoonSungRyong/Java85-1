package step16.ex01.server;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {
  ApplicationContext iocContainer ;
  
  public ServerApp() throws Exception {
    // IoC Container 준비하기
    iocContainer = new ApplicationContext("step16/ex01/server/application-context.properties");
    //iocContainer.print();
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
      handler.setApplicationContext(iocContainer); // 명령어 처리 객체가 들어있는 IoC 컨테이너를 전달한다.
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
  
  
  
  
  
  
  
  
