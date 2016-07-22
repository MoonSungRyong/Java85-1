// 주제: MyLinkedList 테스트 - 조회 테스트
package algorithms.list.linkedlist;

public class Test05 {
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
    System.out.println(list.get(4)); // 값 꺼내기
    System.out.println(list.get(0)); // 값 꺼내기
    System.out.println(list.get(6)); // 값 꺼내기
  }
  
  
}









