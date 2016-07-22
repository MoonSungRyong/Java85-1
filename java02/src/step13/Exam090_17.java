/* 주제: 예외 처리 - 예외 던지기3
 * java.lang.RuntimeException 예외
 * => java.lang.Exception의 하위 클래스이다.
 * => 스텔스 모드 예외 던지기
 * => 일반적인 예외(java.lang.Exception의 하위 클래스)는 
 *    반드시 try... catch... 로 처리하거나,
 *    또는 메서드 선언부에 보고하는 문법을 추가해야 한다.
 * => 그러나 스텔스 모드 예외(java.lang.RuntimeException)는 
 *    중간 호출자에게 영향을 끼치지 않고 
 *    상위 호출자에게 예외를 전달할 수 있다. 
 *    
 */
package step13;

public class Exam090_17 {

  public static void main(String[] args) {
    // 저~~~~ 아래의 어떤 메서드가 던진 스텔스 예외를 여기서 처리
    try {
      m1();
    } catch (RuntimeException e) {
      e.printStackTrace();
    }
  }
  
  // 이렇게 중간에 끼어 있는 호출자들은
  // 예외를 처리하기 위해 어떤 특별한 코드를 첨가할 필요가 없어 편리하다.
  static void m1() {
    // m2()에서 던지 예외를 잡고 싶으면 try... catch... 를 쓰면 되고
    // 굳이 처리하기 싫다면 그냥 다음과 같이 일반 메서드처럼 호출하면 된다.
    // => 예외가 발생하면 자동으로 상위 호출자에게 전달한다.
    m2();
  }
  
  static void m2() {
    // m3()에서 발생한 예외를 잡고 싶으면 try... catch... 를 쓰면 되고
    // 굳이 처리하기 싫다면 그냥 다음과 같이 일반 메서드처럼 호출하면 된다.
    // => 예외가 발생하면 자동으로 상위 호출자에게 전달한다.
    m3();
  }
  
  static void m3() {
    throw new RuntimeException();
  }


}  

/* RuntimeException 예외
 * => m3()에서 예외가 발생했을 때, 
 *    중간에 끼어 있는 m2(), m1()에게 영향을 끼치지 않고 
 *    그 상위 호출자인 main()으로 예외를 전달할 수 있어 
 *    코드 작성 시 매우 편리하다.
 * => 이런 특징으로 인해,
 *    중앙 집중(상위 호출자로 몰아서)으로 예외 처리하는 방식에 적합하다.
 * => OOP에서는 가능한 RuntimeException 방식 보다는
 *    예외 처리가 엄격한 Exception 방식을 사용하라고 권고하고 있다.
 */


















