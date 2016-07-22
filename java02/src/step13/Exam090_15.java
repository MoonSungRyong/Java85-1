/* 주제: 예외 처리 - 예외 던지기
 * => throw [Throwable 객체];
 * Throwable 객체?
 * => java.lang.Throwable의 하위 클래스를 말한다. 
 */
package step13;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Exam090_15 {

  public static void main(String[] args) {
    
  }
  
  // 메서드에 어떤 오류를 던지는 지 반드시 선언해야 한다.
  // => [리턴타입] 메서드명(파라미터...) throws 예외타입, 예외타입, ... {...}
  static void m() throws Throwable {
    // throw new String("오류네요."); // 이거 못 던져요!
    throw new Throwable("오류네요."); // 이거 던질 수 있어요.
  }
  
  // Throwable 하위 클래스를 던질 수 있다.
  static void m2() throws Exception {
    // Throwable의 하위 클래스의 객체들을 던지는 것은 당연하다.
    throw new Exception("하위 클래스...");
  }
  
  // 여러 개의 예외를 던진다면, 메서드 선언에도 그 타입들을 모두 적어준다.
  static void m3(int i) throws Exception, IOException, FileNotFoundException {
    if (i == 0) 
      throw new Exception();
    else if (i == 2)
      throw new IOException();
    else if (i == 3) 
      throw new FileNotFoundException();
  }
  
  //catch 사용할 때처럼 여러 개의 예외를 한 개의 클래스로 표시할 수 있다.
  //즉 공통 상위 클래스로 표시할 수 있다.
  static void m4(int i) throws Exception {
   if (i == 0) 
     throw new Exception();
   else if (i == 2)
     throw new IOException();
   else if (i == 3) 
     throw new FileNotFoundException();
  } 
}  







