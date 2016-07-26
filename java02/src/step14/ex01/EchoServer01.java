// 주제: 네트워크 - 서버 프로그램
// 1단계 - ServerSocket 소개
package step14.ex01;

import java.net.ServerSocket;

public class EchoServer01 {
  public static void main(String[] args) throws Exception {
    //1) 클라이언트의 연결을 관리하는 객체를 생성
    // => 서버 역할을 하는 프로그램은 반드시 이 객체를 생성해야 한다.
    // => 서버쪽은 포트 번호를 지정해야 한다.
    // => 클라이언트는 이 포트 번호를 통해 서버를 구분한다.
    // => 한 컴퓨터에 여러 개의 서버가 실행될 수 있는데 각 서버는 포트 번호로 구분된다.
    // => 포트 번호는 중복으로 사용될 수 없다.
    // => 보통 널리 사용되거나 미리 예약된 포트 번호는 사용하지 않는다.
    //    예) 7(echo), 20/21(FTP), 22(SSH), 23(텔렛), 25(SMTP), 80(웹서버), 110(POP3),
    //        143(IMAP4), 8080(Proxy 서버), 3306(MySQL), 1521(Oracle), ...
    ServerSocket serverSocket = new ServerSocket(8888);
    
    
    //2) 서버를 종료할 때 반드시 자원을 해제시킨다.
    // => 이 프로그램이 사용한 포트 번호를 해제시키는 역할을 한다.
    serverSocket.close();
  }

}

  
  
  
  
  
  
  