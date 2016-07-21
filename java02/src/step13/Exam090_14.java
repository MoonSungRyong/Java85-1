/* 주제: 예외 처리 - 자원해제를 자동화하는 방법2 
 * => try-with-resource 문법을 이용한 자동화!
 */
package step13;

import java.io.FileOutputStream;

public class Exam090_14 {

  public static void main(String[] args) {
    try ( // 이 괄호 안에 선언된 객체는 try~catch~ 블록을 나가기 전에 
        // 자동으로 close()를 호출하여 자원 해제를 수행할 것이다.
        // => 개발자가 직접 finally 블록에 자원 해제 코드를 작성할 필요가 없다는 의미다.
        // 그럼 모든 클래스에 대해서 사용할 수 있는가?
        // => 아니다! java.lang.AutoCloseable 구현체에 대해서만 적용할 수 있다.
        FileOutputStream out = new FileOutputStream("Exam090_13.dat");    
    ) {
      out.write(100);
      
    } catch (Exception e) {
      
    }
  }
}  







