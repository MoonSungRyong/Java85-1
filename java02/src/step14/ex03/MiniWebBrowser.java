package step14.ex03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class MiniWebBrowser {

  public static void main(String[] args) throws Exception {
    Socket socket = new Socket("localhost", 8080);
    
    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    PrintStream out = new PrintStream(socket.getOutputStream());
    
    //웹서버에 요청하기 => HTTP 프로토콜 형식에 따라서 요청해야 한다.
    out.println("HEAD /web01/servlet14 HTTP/1.1");
    out.println("Host: localhost:8080");
    out.println();
    
    //웹서버로부터 응답을 읽기 => HTTP 프로토콜 형식에 따라서 응답 내용을 읽어야 한다.
    String line;
    while (true) {
      line = in.readLine(); 
      System.out.println(line);
      if (line.equals(""))
        break;
    }
    
    int ch;
    while ((ch = in.read()) != -1) {
      System.out.print((char)ch);
    }
    
    
    in.close();
    out.close();
    socket.close();
  }

}
