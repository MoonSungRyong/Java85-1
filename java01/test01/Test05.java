/*문제
1) 숫자(약 -21억 ~ +21억)를 입력받아서 그 숫자 중에 최대 값과 최소 값을 찾아라!
   예) java Test02 1566874
출력 예:
최대 값: 8
최소 값: 1

힌
*/
public class Test05 {
  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);
    int evenCount = 0, oddCount = 0;

    while (num > 0) {
      if (num % 2 == 0)
        evenCount++;
      else
        oddCount++;
      num /= 10;
    }

    System.out.printf("짝수: %d\n", evenCount);
    System.out.printf("홀수: %d\n", oddCount);
  }
}
