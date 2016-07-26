package step14.ex04;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class CalcServer {
  public static void main(String[] args) throws Exception {
    ServerSocket serverSocket = new ServerSocket(8888);
    System.out.println("서버 실행 중...");
    
    Socket socket = serverSocket.accept();
    
    Scanner in = new Scanner(socket.getInputStream());
    PrintStream out = new PrintStream(socket.getOutputStream());
    
    String command = in.nextLine();
    processCommand(command, out);
    
    in.close();
    out.close();
    socket.close();
    
    serverSocket.close();
  }

  private static void processCommand(String command, PrintStream out) {
    switch (command) {
    case "help":
      out.println("[연산자]");
      out.println("더하기: +");
      out.println("빼기: -");
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
    default:
      throw new Exception("지원하지 않는 연산자 입니다.");    
    }
  }
}






