// 주제: 문제 - 링크드리스트 역순으로 바꾸기 
package algorithms.list.linkedlist;

public class Test02 {
  public static void main(String[] args) {
    Node n1 = new Node(100);
    Node n2 = new Node(200);
    Node n3 = new Node(300);
    Node n4 = new Node(400);
    Node n5 = new Node(500);
    
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    
    print(n1);

    Node node = reverseLinkedList2(n1);
    
    print(node);
  }
  
  static Node reverseLinkedList(Node head) {
    Node currNode = head;
    Node prevNode = null;
    Node temp = null;
    
    while (currNode.next != null) {
      temp = currNode.next;
      currNode.next = prevNode;
      prevNode = currNode;
      currNode = temp;
    }
    
    currNode.next = prevNode;
    return currNode;
  }
  
  static Node reverseLinkedList2(Node head) {
    Node currNode = head;
    Node prevNode = null;
    Node temp = null;
    
    do {
      temp = currNode.next;
      currNode.next = prevNode;
      prevNode = currNode;
      currNode = temp;
    } while (currNode != null);
    
    return prevNode;
  }
  
  static void print(Node node) {
    Node temp = node;
    while (temp != null) {
      System.out.printf("%d - ", (int)temp.value);
      temp = temp.next;
    }
    System.out.println();
  }
}









