// 3단계 : Connectionful 방식을 Connectionless 방식으로 전환
package step14.ex04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class CalcClient {

  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);
    String command;
    
    while (true) {
      System.out.print("> ");
      command = keyScan.nextLine();
      if (command.equals("quit"))
        break;
      
      request(command);
    }
    
    keyScan.close();
  }
  
  static void request(String command) {
    Socket socket = null;
    BufferedReader in = null;
    PrintStream out = null;
    
    try {
      socket = new Socket("192.168.0.50", 8888);
      in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      out = new PrintStream(socket.getOutputStream());
      
      // 서버에 명령어 전송
      out.println(command);
      out.flush();
      
      // 서버로부터 응답 수신
      String message = null;
      do {
        message = in.readLine();
        System.out.println(message);
      } while (!message.equals(""));
      
    } catch (Exception e) {
      
    } finally {
      try {in.close();} catch (Exception e) {}
      try {out.close();} catch (Exception e) {}
      try {socket.close();} catch (Exception e) {}
    }
  }

}







