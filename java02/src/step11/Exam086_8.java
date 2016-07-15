/* 주제: 재귀호출
 */
package step11;

public class Exam086_8 {

  public static void main(String[] args) throws Exception {
    // 문제: 1 ~ 10까지 더하기
    //1) 반복문을 이용한 방법
    int sum = 0;
    for (int i = 1; i <= 10; i++)  {
      sum += i;
    }
    System.out.println(sum);
    
    //2) 재귀호출을 이용한 방법
    int sum2 = accumulate(10);
    System.out.println(sum2);
  }
  
  static int accumulate(int i) {
    if (i == 1) 
      return 1;
    
    return i + accumulate(i - 1);
  }
  

}










