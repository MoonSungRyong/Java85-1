/* 문제:
 * 버블 소팅을 이용하여 배열의 값을 정렬하라!
*/
import java.util.Scanner;

public class Test49 {
  public static void main1(String[] args) throws Exception {
    int[] arr = {3, 6, 8, 4, 12, 1, 9, 7};
    
    int i = 0;
    while (i < arr.length) {
      System.out.printf("%d ", arr[i++]);
    }
    System.out.println();
  }
  
  public static void main2(String[] args) throws Exception {
    int[] arr = {3, 6, 8, 4, 12, 1, 9, 7};
    
    int i = 0;
    int end = arr.length - 1;
    while (i < end) {
      System.out.printf("%d ", arr[i++]);
    }
    System.out.println();
  }
  
  public static void main3(String[] args) throws Exception {
    int[] arr = {3, 6, 8, 4, 12, 1, 9, 7};
    
    int i = 0;
    int end = arr.length - 1;
    while (end > 0) {
      i = 0;
      while (i < end) {
        System.out.printf("%d ", arr[i++]);
      }
      System.out.println();
      end--;
    }
    System.out.println();
  }
  
  public static void main(String[] args) throws Exception {
    int[] arr = {3, 6, 8, 4, 12, 1, 9, 7};
    
    int i = 0, temp;
    int end = arr.length - 1;
    while (end > 0) {
      i = 0;
      while (i < end) {
        if (arr[i] > arr[i + 1]) {
          temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
        }
        i++;
      }
      end--;
    }
    
    i = 0;
    while (i < arr.length) {
      System.out.printf("%d ", arr[i++]);
    }
    System.out.println();
  }
  
}




/**/
