// 1단계: 연결 후 한 번만 명령어를 보낸다.
package step14.ex04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class CalcClient01 {

  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);
    Socket socket = new Socket("localhost", 8888);

    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    PrintStream out = new PrintStream(socket.getOutputStream());
    
    System.out.print("> ");
    String command = keyScan.nextLine();
    out.println(command);
    
    String message;
    do {
      message = in.readLine();
      System.out.println(message);
    } while (!message.equals(""));
    
    in.close();
    out.close();
    socket.close();
    keyScan.close();
  }

}







