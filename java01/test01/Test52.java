/* 문제:
 * 양의 정수를 입력받아 그 순서에 있는 알파벳을 출력한다.
   순서는 0부터 시작한다. 25가 넘어가면 로테이션한다.(대문자)
   => getChar() 함수를 완성하시오!
*/
import java.util.Scanner;

public class Test52 {
  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);
    int value = Math.abs(Integer.parseInt(keyScan.nextLine()));
    
    System.out.println(getChar(value));
  }
  
  static char getChar(int i) {
    return (char)('A' + (i % 26));
  }
  
}




/**/
