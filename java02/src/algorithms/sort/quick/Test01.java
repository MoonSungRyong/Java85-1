package algorithms.sort.quick;

public class Test01 {
  static int[] element = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};

  public static void main(String[] args) {
    quickSort(0, element.length - 1);
    
    printElement();
  }
  
  static void quickSort(int startIndex, int endIndex) {
    if (startIndex == endIndex || startIndex > element.length - 1 )
      return;
    
    int pivotIndex = startIndex;
    int storeIndex = pivotIndex + 1;
    
    for (int i = pivotIndex + 1; i <= endIndex; i++) {
      if (element[i] < element[pivotIndex]) {
        swap(i, storeIndex);
        storeIndex++;
      }
    }
    
    swap(pivotIndex, storeIndex - 1);
    
    quickSort(pivotIndex, storeIndex - 1);
    quickSort(storeIndex, endIndex);
  }
  
  static void swap(int index1, int index2) {
    if (index1 == index2)
      return;
    
    int temp = element[index1];
    element[index1] = element[index2];
    element[index2] = temp;
    printElement();
    try {
      Thread.currentThread().sleep(1000);
    } catch (Exception e) {}
  }
  
  static void printElement() {
    for (int value : element) {
      System.out.print(value + ", ");
    }
    System.out.println();
  }

}
