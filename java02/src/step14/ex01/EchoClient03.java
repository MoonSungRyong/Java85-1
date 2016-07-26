package step14.ex01;

import java.net.Socket;

public class EchoClient03 {

  public static void main(String[] args) throws Exception {
    //서버와 연결을 수행을 객체를 생성한다.
    //=> 연결할 서버의 주소(IP Address 또는 도메인 이름)와 서버의 포트 번호를 지정한다.
    //=> 서버와 연결이 되면 객체를 리턴한다.
    //=> 클라이언트 쪽도 포트 번호가 필요한데, OS에서 자동으로 부여한다.
    //   클라이언트에서 임의로 포트 번호를 지정할 수 없다.
    //=> 한 컴퓨터에 여러 개의 클라이언트가 실행되기 때문에 
    //   각 클라이언트의 연결을 구분하기 위한 식별자가 필요하다. 
    //   그 식별자로 포트 번호를 사용하는 것이다.
    Socket socket = new Socket("localhost", 8888);
    System.out.println("서버와 연결되었습니다.");
    
    for (int i = 0; i < 300; i++) {
      Thread.currentThread().sleep(1000);
    }
    
    //소켓을 사용한 후에는 반드시 자원을 해제시켜야 한다.
    socket.close();
  }

}












