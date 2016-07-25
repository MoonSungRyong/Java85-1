package step14.ex01;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {

  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);
    
    System.out.print("연결할 서버 주소? ");
    String serverAddr = keyScan.nextLine();
    
    System.out.print("포트번호? ");
    int port = Integer.parseInt(keyScan.nextLine());
    
    Socket socket = new Socket(serverAddr, port); // 서버와 연결하기
    Scanner in = new Scanner(socket.getInputStream());
    PrintStream out = new PrintStream(socket.getOutputStream());
    
    System.out.print("보낼 메시지? ");
    String message = keyScan.nextLine();
    
    out.println(message);  // 서버에게 메시지 보내기
    String receivedMessage = in.nextLine();
    
    System.out.println(receivedMessage);
    
    in.close();
    out.close();
    socket.close();
  }

}












