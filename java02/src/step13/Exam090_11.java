/* 주제: 예외 처리 - catch의 사용법
 * => 예외 종류에 따라 처리를 달리 할 수 있다.
 * => catch 순서?
 */
package step13;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Exam090_11 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    try {
      System.out.println("try....블록 실행");
      
      System.out.print("값? ");
      int value = keyScan.nextInt();
      switch (value) {
      case 1:
        throw new Exception("11111");
      case 2:
        throw new RuntimeException("22222");
      case 3:
        throw new IOException("3333");
      case 4: 
        throw new FileNotFoundException("4444");
      }
      
    } catch (Exception e) { // 이 변수는 다형적 변수에 입각하여 그 하위 객체를 모두 가리킬 수 있다.
      System.out.println("11111");
    } catch (RuntimeException e) { // 그래서 이 부분은 절대로 실행될 수 없다.
      System.out.println("2222");
    } catch (FileNotFoundException e) { // 컴파일 오류가 발생한다.
      System.out.println("4444");
    } catch (IOException e) { // 따라서 catch는 반드시 자식 클래스부터 수퍼클래스 순서로 나열해야 한다.
      System.out.println("33333");
    }
  }
}  







