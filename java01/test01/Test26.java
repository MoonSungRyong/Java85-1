/*문제
1) 반복문을 사용하여 4에서 30까지 1씩 증가한 값을 출력한다.
   단 10 이상 20 미만인 경우는 출력하지 말아라.
2) 출력 예:
2 5 8 11 ...
*/


public class Test26 {
  public static void main(String[] args) {
    for (int i = 4; i <= 30; i++) {
      if (i >= 10 && i < 20) {
        continue;
      }
      System.out.printf("%d ", i);
    }
    System.out.println();
  }
}




/**/
