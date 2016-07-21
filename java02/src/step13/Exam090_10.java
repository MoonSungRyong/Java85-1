/* 주제: 예외 처리 - catch의 사용법
 * => 예외 종류에 따라 처리를 달리 할 수 있다.
 */
package step13;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Exam090_10 {

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
      
    } catch (FileNotFoundException e) {
      System.out.println("4444");
    } catch (IOException e) {
      System.out.println("33333");
    } catch (RuntimeException e) {
      System.out.println("2222");
    } catch (Exception e) {
      System.out.println("11111");
    }
  }
}  







