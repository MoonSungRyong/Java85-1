// 주제: LinkedList 맛보기
package algorithms.list.linkedlist;

public class Test01 {
  public static void main(String[] args) {
    Node n1 = new Node(100);
    Node n2 = new Node(200);
    Node n3 = new Node(300);
    Node n4 = new Node(400);
    
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    
    Node head = n1;
    Node tail = n4;
    
    print(head);
    System.out.println("\n-----------------------");
    
    Node n5 = new Node(500);
    tail.next = n5;
    
    print(head);
    
    
  }
  
  static void print(Node node) {
    Node temp = node;
    while (temp != null) {
      System.out.printf("%d - ", (int)temp.value);
      temp = temp.next;
    }
  }
}









