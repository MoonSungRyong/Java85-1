/* 주제: Spring Inversion Of Control Container 적용 
 * 0) 기존 클래스 제거
 *    - ApplicationContext.java 삭제
 *    - Component.java 애노테이션 삭제
 *    - FactoryBean.java 인터페이스 삭제 
 * 
 * 1) 스프링 라이브러리 추가
 *    - spring-context.jar
 *    - spring-beans.jar
 *    - spring-core.jar
 *    
 * 2) 스프링 ApplicationContext 객체 생성
 *    - new ClassPathXmlApplicationContext()
 *    
 * 3) 스프링 설정 파일 생성
 *    - application-context.xml 
 *    
 * 4) 스프링 IoC 컨테이너로 관리할 대상 객체에 @Component 애노테이션을 붙이기
 *    - XxxXxxCommand.java 
 *    - BoardDaoImpl.java 
 *    - SqlSessionFactoryFactoryBean.java
 * 
 * 5) SqlSessionFactoryFactoryBean의 구현 변경 
 *    - 스프링에서 제공하는 FactoryBean 인터페이스를 구현하라!
 * 
 * 6) 의존 객체를 주입을 요구하는 @Autowired 애노테이션을 인스턴스 변수 앞에 붙여라!
 *    - 셋터 메서드 필요없다.
 *    - XxxXxxCommand.java
 *    - BoardDaoImpl.java     
 */
package step16.ex04.server;

import java.net.ServerSocket;
import java.net.Socket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServerApp {
  ApplicationContext iocContainer ;
  
  public ServerApp() throws Exception {
    // Spring IoC Container 준비하기
    iocContainer = new ClassPathXmlApplicationContext(
                        "step16/ex04/server/application-context.xml");
   }
  
  private void execute() throws Exception {
    ServerSocket serverSocket = new ServerSocket(8888);
    System.out.println("서버 실행 중...");
    
    Socket socket;
    RequestHandler handler;
    
    while (true) {
      socket = serverSocket.accept();

      handler = new RequestHandler();
      handler.setSocket(socket); // 클라이언트와 통신할 소켓을 주입하고,
      handler.setApplicationContext(iocContainer); // 명령어 처리 객체가 들어있는 IoC 컨테이너를 전달한다.
      handler.start();
    }
    
  }
  
  public static void main(String[] args) {
    try {
      ServerApp server = new ServerApp();
      server.execute();
      
    } catch (Exception e) {
      System.out.println("서버 실행 중에 오류 발생!");
      e.printStackTrace();
    }
  }

}
  
  
  
  
  
  
  
  
