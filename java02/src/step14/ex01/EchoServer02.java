// 주제: 네트워크 - 서버 프로그램
// 2단계 - 클라이언트 연결 테스트
package step14.ex01;

import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer02 {
  public static void main(String[] args) throws Exception {
    //클라이언트의 연결을 관리하는 객체를 생성
    ServerSocket serverSocket = new ServerSocket(8888);
    
    //클라이언트 연결을 기다린다. 그리고 대기열에 등록된 순서대로 연결을 승인한다.
    //=> 클라이언트와의 통신을 담당할 객체를 리턴한다.
    System.out.println("클라이언트의 연결을 기다리고 있습니다.");
    Socket socket = serverSocket.accept();
    
    System.out.println("클라이언트와 연결되었습니다.");
    
    //소켓을 사용한 후에는 반드시 자원을 해제시킨다.
    socket.close();
    
    //서버를 종료할 때 반드시 자원을 해제시킨다.
    serverSocket.close();
  }

}

  
  
  
  
  
  
  