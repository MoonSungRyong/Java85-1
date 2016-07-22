// 주제: MyLinkedList 테스트 - Iterator 구현 테스트
package algorithms.list.linkedlist;

import java.util.Iterator;

public class Test06 {
  public static void main(String[] args) {
    MyLinkedList list = new MyLinkedList();
    list.add(100);
    list.add(200);
    list.add(300);
    list.add(400);
    list.add(500);
    list.add(600);
    list.add(700);
    
    Iterator iterator = list.iterator();
    
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
  
  
}









