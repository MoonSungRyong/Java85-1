package step14.ex01;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
  public static void main(String[] args) throws Exception {
    ServerSocket ss = new ServerSocket(8888);
    
    Socket s;
    Scanner in;
    PrintStream out;
    String message;
    
    while (true) {
      System.out.println("클라이언트의 연결을 기다리는 중...");
      try {
        s = ss.accept(); // 클라이언트와 연결한 소켓 얻기
        System.out.println("클라이언트가 연결되었습니다.");
        
        in = new Scanner(s.getInputStream());  // 소켓에서 입력 스트림 꺼내기
        out = new PrintStream(s.getOutputStream()); // 소켓에서 출력 스트림 꺼내기
        
        message = in.nextLine();  // 클라이언트로부터 메시지 읽기 
        out.println(message + "-강사"); // 클라이언트로 메시지 보내기
        
        in.close();
        out.close();
        s.close();
        System.out.println("클라이언트와의 연결을 끊었습니다.");
      } catch (Exception e) {
        System.out.println("클라이언트 요청 처리중 오류 발생!");
      }
    }
  }

}

  
  
  
  
  
  
  