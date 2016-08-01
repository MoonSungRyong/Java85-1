//2단계: 프록시 패턴 적용 후
package designpatterns.proxy.client;

import java.util.Scanner;

import designpatterns.proxy.server.Calc;
import designpatterns.proxy.server.CalcProxy;

public class CalcClient {

  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);
    Calc calc = new CalcProxy("localhost", 8888);
    
    int a, b, result;
    String op;
    
    while (true) {
      System.out.println("명령어를 입력하세요. 예) 12 - 34\n명령어> ");
      a = keyScan.nextInt();
      op = keyScan.next();
      b = keyScan.nextInt();
      
      switch (op) {
      case "+": result = calc.plus(a, b); break; // 실제 CalcImpl의 대행자를 통해 메서드를 호출한다.
      case "-": result = calc.minus(a, b); break;
      default:
        result = 0;
      }

      System.out.printf("%d %s %d = %d\n", a, op, b, result);
    }
    
    //keyScan.close();
  }

}

/* 프록시 패턴
 * => 작업을 요청하는 코드를 객체화시켜 클라이언트 코드 작성을 간결하게 도와준다.
 * => 프록시 객체? 
 *    - 실제 작업을 처리하는 객체를 중계하는 역할을 수행.
 *    - 실제 작업을 처리하는 객체와 동일하게 같은 인터페이스를 구현해야 한다.
 *    - 클라이언트 쪽에는 실제 작업을 처리하는 객체인 것 처럼 보인다.
 * => 클라이언트(작업을 요청하는 객체)는 대행자(프록시)를 실제 작업을 수행하는 객체인양 사용한다.
 * => 클라이언트 개발자에게 복잡한 작업 요청을 감추는 효과가 있다. 
 */






