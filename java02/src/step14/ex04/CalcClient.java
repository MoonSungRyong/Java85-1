package step14.ex04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class CalcClient {

  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);
    Socket socket = new Socket("192.168.0.50", 8888);

    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    PrintStream out = new PrintStream(socket.getOutputStream());
    
    String command;
    String message;
    
    do {
      System.out.print("> ");
      command = keyScan.nextLine();
      out.println(command);
      out.flush();
      
      do {
        message = in.readLine();
        System.out.println(message);
      } while (!message.equals(""));
    } while (!command.equals("quit"));
    
    in.close();
    out.close();
    socket.close();
    keyScan.close();
  }

}







