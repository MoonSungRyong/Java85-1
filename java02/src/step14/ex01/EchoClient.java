package step14.ex01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {

  public static void main(String[] args) throws Exception {
    //서버와 연결을 수행을 객체를 생성한다.
    Socket socket = new Socket("localhost", 8888);
    System.out.println("서버와 연결되었습니다.");

    //소켓으로부터 입출력 스트림 객체 꺼내기
    InputStream in = socket.getInputStream();
    OutputStream out = socket.getOutputStream();
    
    //입출력 스트림 객체에 데코레이터 붙이기
    BufferedReader in2 = new BufferedReader(new InputStreamReader(in));
    PrintWriter out2 = new PrintWriter(new OutputStreamWriter(out));
    
    //서버로 데이터 출력하기
    out2.println("hello");
    out2.flush(); // 소켓 내부의 임시 버퍼에 출력된 것을 서버로 내보낸다.
    
    //서버가 보낸 데이터 읽기
    String message = in2.readLine();
    System.out.println(message);
    
    in2.close();
    out2.close();
    
    //입출력 스트림을 사용한 후에는 반드시 닫아야 한다.
    in.close();
    out.close();
    
    //소켓을 사용한 후에는 반드시 자원을 해제시켜야 한다.
    socket.close();
  }

}












