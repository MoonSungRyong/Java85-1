package algorithms.list.linkedlist;

public class MyLinkedList {
  Node head;
  Node tail;
  int count;
  
  public MyLinkedList() {
    head = new Node();
    tail = head;
  }
  
  public void add(Object value) {
    tail.value = value;
    tail.next = new Node();
    tail = tail.next;
    count++;
  }
  
  public void insert(int index, Object value) {
    Node currNode = head;
    Node temp;
    
    if (index < 0 || index >= count) {
      throw new RuntimeException("인덱스의 범위를 벗어났습니다.");
    }
    
    if (index == 0) {
      temp = new Node(value);
      temp.next = head;
      head = temp;
      count++;
      return;
    }
    
    //1) 인덱스 바로 전 노드를 찾는다.
    while (--index > 0) {
      currNode = currNode.next;
    }
    
    //2) 새노드를 인덱스 위치에 끼워 넣는다.
    temp = new Node(value);
    temp.next = currNode.next;
    currNode.next = temp;
    count++;
  }
  
  public int size() {
    return count;
  }
  
  void print() {
    Node temp = head;
    while (temp != null && temp != tail) {
      System.out.printf("%d - ", (int)temp.value);
      temp = temp.next;
    }
    System.out.println();
  }
  
  
  class Node {
    Object value;
    Node next;
    
    public Node() {}
    
    public Node(Object value) {
      this.value = value;
    }
  }
}
