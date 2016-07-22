/* 주제: 예외 처리 - 예외 던지기2
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

public class Exam090_16 {

  public static void main(String[] args) {
    // 저~~~~ 아래의 어떤 메서드가 던진 일반 예외를 여기서 처리
    try {
      m1();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  // 아이 씨~~~ 귀찮아.. 어차피 나를 호출한 쪽에서 예외를 처리할 건데
  // 이렇게 메서드 선언부에 예외를 던진다고 표시해야 하다니.. 헐...
  static void m1() throws Exception {
    m2();
  }
  
  //아이 씨~~~ 귀찮아.. 어차피 나를 호출한 쪽에서 예외를 처리할 건데
  // 이렇게 메서드 선언부에 예외를 던진다고 표시해야 하다니.. 헐...
  static void m2() throws Exception {
    m3();
  }
  
  // 미안~~ 나를 호출하는 쪽에서는 예외를 처리해줘!!! 
  // 직접 처리하든가.. 아니면 상위 호출자에게 떠넘기던가..
  static void m3() throws Exception {
    // 일반 예외 던지기 
    throw new Exception();
  }


}  







