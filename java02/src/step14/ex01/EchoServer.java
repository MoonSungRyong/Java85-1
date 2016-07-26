// 주제: 네트워크 - 서버 프로그램
// 4단계 - 읽고 쓰기
package step14.ex01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
  public static void main(String[] args) throws Exception {
    //클라이언트의 연결을 관리하는 객체를 생성
    ServerSocket serverSocket = new ServerSocket(8888);
    System.out.println("클라이언트의 연결을 기다리고 있습니다.");

    // accept()는 대기열에서 기다리고 있는 순서대로 연결을 승인한다.
    Socket socket = serverSocket.accept();
    System.out.println("클라이언트와 연결되었습니다.");
    
    //소켓으로부터 입력스트림과 출력스트림을 꺼낸다.
    InputStream in = socket.getInputStream();
    OutputStream out = socket.getOutputStream();
    
    //원래 객체를 그대로 사용하기에는 read(), write() 메서드가 너무 단순한다.
    //=> 원래의 입출력 객체에 데코레이터를 붙여서 사용하자!
    InputStreamReader adapter = new InputStreamReader(in); // byte stream --> character stream 변환
    BufferedReader in2 = new BufferedReader(adapter);
    
    OutputStreamWriter adapter2 = new OutputStreamWriter(out); // character stream --> byte stream 변환 
    PrintWriter out2 = new PrintWriter(adapter2);
    
    // 클라이언트가 보낸 데이터 읽기
    String message = in2.readLine();
    
    // 클라이언트에게 데이터 출력하기
    out2.println(message);
    out2.flush();// 소켓 내부의 임시 버퍼에 출력된 것을 서버로 내보낸다.
    
    out2.close();
    in2.close();
    adapter.close();
    adapter2.close();
    
    // 입력을 모두 사용한 후에는 반드시 닫는다.
    in.close();
    out.close();
    
    //소켓을 사용한 후에는 반드시 자원을 해제시킨다.
    socket.close();
    
    //서버를 종료할 때 반드시 자원을 해제시킨다.
    serverSocket.close();
  }

}

  
  
  
  
  
  
  