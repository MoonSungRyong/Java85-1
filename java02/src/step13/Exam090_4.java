/* 주제: 예외 처리 - 예외 처리를 하는 방법 2 "변기 깨졌으~" */
package step13;

public class Exam090_4 {

  public static void main(String[] args) {
    try {
      work2(); // 보고 받은 쪽에서 처리한다.
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  // 내부적으로 처리해서는 안되는 경우,
  // 반드시 호출자에게 오류 상황을 보고하는 것이 좋다.
  static void work2() throws Exception {
    throw new Exception("변기 깨졌다."); // 예외 발생!
  }

}









