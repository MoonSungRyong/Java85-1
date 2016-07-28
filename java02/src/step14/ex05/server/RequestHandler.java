package step14.ex05.server;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

class RequestHandler extends Thread {
  Socket socket;
  
  public RequestHandler(Socket socket) {
    this.socket = socket;
  }
  
  @Override
  public void run() {
    Scanner in = null;
    PrintStream out = null;
    String request = null;
    
    try {
      in = new Scanner(socket.getInputStream());
      out = new PrintStream(socket.getOutputStream());
      
      request = in.nextLine();
      service(request, out);
      
    } catch (Exception e) {
      System.out.println("클라이언트 요청을 처리하는 중에 오류 발생!");
      
    } finally {
      try {in.close();} catch (Exception e) {}
      try {out.close();} catch (Exception e) {}
      try {socket.close();} catch (Exception e) {}
    }
  }
  
  private void service(String request, PrintStream out) {
    out.println("Hello!");
    out.println();
  }

}








