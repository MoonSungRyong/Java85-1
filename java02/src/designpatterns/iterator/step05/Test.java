/* 주제: 상속 - 추상 클래스의 한계
 * => printList()에는 Iterator 자식 객체만 줄 수 있다. 
 *    다른 클래스의 자식은 불가능!
 * 
 */ 
package designpatterns.iterator.step05;

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
    //=> 3의 배수로 인덱스를 증가시키면서 값을 꺼내주는
    //   이터레이터가 이미 있지만, 다른 클래스의 자식이라서
    //   다음과 같이 printList()에 파라미터로 전달할 수 없다.
    //printList(new ThreeIterator(arr));
  }
  
  static void printList(Iterator iterator) {
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + ",");
    }
    System.out.println();
  }
}





