/* 주제: 예외 처리 - 자원해제를 자동화하는 방법 
 * => finally 사용법 
 */
package step13;

import java.io.FileOutputStream;

public class Exam090_13 {

  public static void main(String[] args) {
    FileOutputStream out = null;
    
    try {
      out = new FileOutputStream("Exam090_13.dat");
      out.write(100);
      
    } catch (Exception e) {
      
    } finally { // 자원해제는 finally에서 수행한다.
      // 중요한 것은 개발자가 직접 코딩해야 한다.
      try {out.close();} catch (Exception e) {}
    }
  }
}  







