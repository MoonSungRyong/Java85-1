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
