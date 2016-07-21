/* 주제: 예외 처리 - 예외 처리를 하는 방법 3 "변기 휴지통 불났으~~" */
package step13;

public class Exam090_5 {

  public static void main(String[] args) {
    try {
      work3(); // 보고 받은 쪽에서 처리한다.
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  // 내부적으로 처리해서는 안되는 경우,
  // 그런데 보고하기 전에 임시 처리해야 하는 경우,
  // 그런 경우 try ~ catch ~ 를 사용하여 내부적으로 처리한 후 
  // 호출자에게 보고하는 방식을 취한다.
  static void work3() throws Exception {
    try {
      throw new Exception("변기 휴지통 불났다!"); // 예외 발생!
    } catch (Exception e) {
      System.out.println("휴지통 불끈다.");
      throw e;
    }
  }

}









