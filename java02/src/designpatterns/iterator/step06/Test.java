/* 주제: 상속 - 인터페이스의 이점
 * => printList()에 Iterator의 구현체를 줄 수 있다.
 *    부모가 누구인지 알 필요가 없다. 
 */ 
package designpatterns.iterator.step06;

public class Test {
  public static void main(String[] args) {
    String[] arr = {
        "홍길동", "임꺽정", "이순신", "유관순", "안중근", "윤봉길", "김구",
        "안창호", "강감찬", "장보고", "을지문덕"
    };
    
    //1) 이름을 순서대로 출력하기
    printList(new AscIterator(arr));
    
    //2) 이름을 역순으로 출력하기
    printList(new DescIterator(arr));
    
    //3) 홀수 인덱스의 이름을 출력하기
    printList(new OddIterator(arr));
    
    //4) 짝수 인덱스의 이름을 출력하기
    printList(new EvenIterator(arr));
    
    //5) 인덱스를 3의 배수로 증가하면서 이름을 출력하기
    printList(new ThreeIterator(arr));
  }
  
  static void printList(Iterator iterator) {
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + ",");
    }
    System.out.println();
  }
}





