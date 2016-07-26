// 주제: 네트워크 - 서버 프로그램
// 3단계 - 대기열 개수 지정하기
package step14.ex01;

import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer03 {
  public static void main(String[] args) throws Exception {
    //클라이언트의 연결을 관리하는 객체를 생성
    //=> backinglog : 대기열의 개수를 지정할 수 있다.
    //=> 대기열의 개수를 초과하여 들어온 클라이언트 요청은
    //   일정 시간이 지나면 타임아웃 오류를 발생시킨다.
    //=> 대기열의 개수를 너무 크게 늘리면 서버 메모리가 소모된다.
    //   적당량을 유지해야 한다.
    ServerSocket serverSocket = new ServerSocket(8888, 10);

    // accept()는 대기열에서 기다리고 있는 순서대로 연결을 승인한다.
    // => 대기열의 빈자리는 연결을 시도하고 있는 클라이언트로 채운다.
    //클라이언트 연결을 기다린다. 그리고 대기열에 등록된 순서대로 연결을 승인한다.
    System.out.println("클라이언트의 연결을 기다리고 있습니다.");
    Socket socket = serverSocket.accept();
    
    System.out.println("클라이언트와 연결되었습니다.");
    
    Thread.currentThread().sleep(300000);
    
    //소켓을 사용한 후에는 반드시 자원을 해제시킨다.
    socket.close();
    
    //서버를 종료할 때 반드시 자원을 해제시킨다.
    serverSocket.close();
  }

}

  
  
  
  
  
  
  