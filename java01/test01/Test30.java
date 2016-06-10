/*문제
1) 0에서 19까지 정수가 저장된 배열의 수를 임의로 섞어라.
int[] numbers = {0, ..., 19}
2) 출력 예:
17 2 1 19 5 ...

3) 숫자를 섞기 위해 임의로 인덱스를 뽑아내기
Math.random() * 20
*/


public class Test30 {
  public static void main(String[] args) {
    //1) 20개의 숫자를 저장할 배열을 준비
    int[] numbers = new int[20];

    //2) 각 방에 0부터 19까지 숫자를 저장
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = i;
    }

    //3) 20번을 반복하면서 배열 안의 숫자를 섞는다.
    int index1, index2, temp;
    for (int i = 0; i < numbers.length; i++) {
      index1 = (int)(Math.random() * 20);
      index2 = (int)(Math.random() * 20);
      temp = numbers[index1];
      numbers[index1] = numbers[index2];
      numbers[index2] = temp;
    }

    //4) 배열을 출력한다.
    for (int i = 0; i < numbers.length; i++) {
      System.out.printf("%d ", numbers[i]);
    }
    System.out.println();
  }
}




/**/
