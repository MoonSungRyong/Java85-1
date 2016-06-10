/*문제
1) 정수 배열에 0부터 19까지의 수가 섞여 저장되어 있다.
   숫자를 0부터 19까지 오름차순(ascending)으로 정렬하라!
int[] numbers = {12,7,9,19,1,...}
2) 출력 예:
0 1 2 3 4 ... 19

3) 숫자를 섞기 위해 사용자가 만든 도구를 사용하라!
Math.random() * 20
*/


public class Test31 {
  public static void main(String[] args) {
    //1) 20개의 숫자를 저장할 배열을 준비
    int[] numbers = new int[20];

    //2) 각 방에 0부터 19까지 숫자를 저장
    Array.initByIndexValue(numbers);

    //3) 배열 안의 숫자를 섞는다.
    Array.mix(numbers); // Array 도구함에 있는 mix() 도구를 실행하여
                       // 배열의 값을 섞는다.

    //4) 배열 안의 값을 오름차순으로 정렬한다.
    


    //5) 배열을 출력한다.
    Array.printAll(numbers);
  }
}




/**/
