package algorithms.list.linkedlist;

import java.util.Iterator;

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
    if (index < 0 || index >= count) {
      throw new RuntimeException("인덱스의 범위를 벗어났습니다.");
    }

    Node currNode = head;
    Node temp;
    
    //1) 인덱스 바로 전 노드를 찾는다.
    while (--index > 0) {
      currNode = currNode.next;
    }
    
    //2) 새노드를 인덱스 위치에 끼워 넣는다.
    temp = new Node(value);
    if (index == 0) {
      temp.next = head;
      head = temp;
    } else {
      temp.next = currNode.next;
      currNode.next = temp;
    }
    count++;
  }
  
  public Object remove(int index) {
    if (index < 0 || index >= count) {
      throw new RuntimeException("인덱스의 범위를 벗어났습니다.");
    }
    
    Node currNode = head;
    Node prevNode = null;
    
    //1) 인덱스에 해당하는 노드를 찾는다.
    for (int i = 0; i < index; i++) {
      prevNode = currNode; // 현재 노드 주소를 보관해둔다.
      currNode = currNode.next; // 다음 노드 주소를 가리킨다.
    }
    
    if (index == 0) {
      head = head.next;
    } else {
      //2) 이전 노드는 다,다음 노드(현재 노드가 가리키는 다음 노드)를 바로 가리킨다.
      prevNode.next = currNode.next;
    }
    count--;
    return currNode.value; // 리턴 값은 삭제한 현재 노드의 값이다.
  }
  
  public Object get(int index) {
    if (index < 0 || index >= count) {
      throw new RuntimeException("인덱스의 범위를 벗어났습니다.");
    }
    
    Node currNode = head;
    
    //1) 인덱스에 해당하는 노드를 찾는다.
    for (int i = 0; i < index; i++) {
      currNode = currNode.next; // 다음 노드 주소를 가리킨다.
    }
    
    return currNode.value;
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
  
  public Iterator iterator() {
    return new Iterator() {
      int index;
      
      @Override
      public boolean hasNext() {
        if (index >= 0 && index < size())
          return true;
        else 
          return false;
      }

      @Override
      public Object next() {
        return get(index++);
      }
    };
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
