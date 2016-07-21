/* 주제: 예외 처리 - 예외 처리를 하는 방법 1 "변기에 똥 묻었으~" */
package step13;

public class Exam090_3 {

  public static void main(String[] args) {
    try {
      work1();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  // 내부적으로 처리해도 문제가 없는 예외인 경우
  // 호출자에게 보고하는 방식보다 자체적으로 처리하는 것이 더 좋다.
  static void work1() {
    try {
      throw new Exception("변기에 똥 묻는 사건 발생"); // 예외 발생!
    } catch (Exception e) {
      System.out.println("똥 닦는다."); // 자체적으로 처리. 호출자는 모른다.
    }
  }

}









