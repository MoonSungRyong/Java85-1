// 주제: MyLinkedList 테스트
package algorithms.list.linkedlist;

public class Test03 {
  public static void main(String[] args) {
    MyLinkedList list = new MyLinkedList();
    list.add(100);
    list.add(200);
    list.add(300);
    list.add(400);
    
    System.out.println(list.size());
    list.print();
    System.out.println("--------------");
    
    list.insert(0, 8888);
    list.insert(list.size()-1, 9999);
    list.insert(2, 5555);
    System.out.println(list.size());
    list.print();
    System.out.println("--------------");
    
    
  }
  
  
}









