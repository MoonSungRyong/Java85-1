// 3단계 : 순차적으로 여러 번의 연결을 허용하기
package step14.ex04;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class CalcServer03 {
  public static void main(String[] args) throws Exception {
    ServerSocket serverSocket = new ServerSocket(8888);
    System.out.println("서버 실행 중...");
    
    // 여러 사용자의 접속을 수용한다.
    Socket socket;
    while (true) {
      socket = serverSocket.accept();
      service(socket);
    }
    
    //serverSocket.close();
  }

  private static void service(Socket socket) {
    Scanner in = null;
    PrintStream out = null;
    String command = null;
    
    try {
      in = new Scanner(socket.getInputStream());
      out = new PrintStream(socket.getOutputStream());
      
      do {
        command = in.nextLine();
        processCommand(command, out);
      } while (!command.equals("quit"));
      
    } catch (Exception e) {
      System.out.println("클라이언트 요청을 처리하는 중에 오류 발생!");
      
    } finally {
      try {in.close();} catch (Exception e) {}
      try {out.close();} catch (Exception e) {}
      try {socket.close();} catch (Exception e) {}
    }
  }
  
  private static void processCommand(String command, PrintStream out) {
    switch (command) {
    case "help":
      out.println("[연산자]");
      out.println("더하기: +");
      out.println("빼기  : -"); 
      out.println("곱하기: *"); 
      out.println("나누기: /"); 
      out.println("나머지: %"); 
      out.println("거듭제곱: **"); 
      out.println("[사용법]");
      out.println("> 2 + 3");
      out.println("5");
      out.println();
      break;
    case "quit":
      out.println("안녕히 가세요!");
      out.println();
    default:
      try {
        out.println(compute(command));
        out.println();
      } catch (Exception e) {
        out.println(e.getMessage());
        out.println();
      }
    }
    out.flush();
  }

  private static int compute(String command) throws Exception {
    String[] values = command.split(" ");
    int a = Integer.parseInt(values[0]);
    int b = Integer.parseInt(values[2]);
    switch (values[1]) {
    case "+":
      return a + b;
    case "-":
      return a - b;
    case "*":
      return a * b;
    case "/":
      return a / b;
    case "%":
      return a % b;
    case "**":
      return (int)Math.pow(a, b);  
    default:
      throw new Exception("지원하지 않는 연산자 입니다.");    
    }
  }
}






