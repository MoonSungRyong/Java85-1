// 주제: MyLinkedList 테스트 - 삭제 테스트
package algorithms.list.linkedlist;

public class Test04 {
  public static void main(String[] args) {
    MyLinkedList list = new MyLinkedList();
    list.add(100);
    list.add(200);
    list.add(300);
    list.add(400);
    list.add(500);
    list.add(600);
    list.add(700);
    
    // 삭제 테스트
    System.out.println(list.remove(4)); // 중간 항목 삭제
    System.out.println(list.size());
    list.print();
    System.out.println("--------------");
    
    System.out.println(list.remove(0)); // 맨 앞의 항목 삭제
    System.out.println(list.size());
    list.print();
    System.out.println("--------------"); // 맨 뒤의 항목 삭제
    
    System.out.println(list.remove(4));
    System.out.println(list.size());
    list.print();
    System.out.println("--------------");
    
  }
  
  
}









