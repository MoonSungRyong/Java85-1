/* 문제:
*/
import java.util.Scanner;

public class Test54 {
  static int[] element = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
  
  public static void main(String[] args) throws Exception {
    quickSort(0, element.length - 1);
    print();
  }
  
  static void quickSort(int startIndex, int endIndex) {
    //1) startIndex와 endIndex 유효성 검사
    
    //2) 기준 인덱스(pivotIndex)를 지정
    
    //3) 기준 값(pivot) 보다 작은 값을 저장할 인덱스 지정
    
    //4) 기준 인덱스의 다음 값부터 끝까지 반복하면 값을 비교한다.
      //5) i 번 방의 값이 기준 값 보다 작으면 기준 값 옆으로 옮긴다.
        //6) 작은 값을 저장할 위치를 하나 증가시킨다.
    
    //7) 기준 값과 맨 마지막에 옮긴 작은 값의 위치를 맞 바꾼다.
    
    //8) 기준값이 있는 위치를 기준으로 그 앞쪽의 값을 정렬한다.
    
    //9) 기준값이 있는 위치를 기준으로 그 뒤쪽의 값을 정렬한다.
  }
  
  static void swap(int index1, int index2) {
    if (index1 == index2) // 교환할 값의 인덱스가 같다면 교환할 필요가 없다.
      return;
    int temp = element[index1];
    element[index1] = element[index2];
    element[index2] = temp;
  }
  
  static void print() {
    for (int value : element) {
      System.out.printf("%d, ", value);
    }
    System.out.println();
  }
}




/**/
