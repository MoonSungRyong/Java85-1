/* 주제: 상속 - 추상 클래스와 인터페이스의 결합
 * => 파라미터 타입으로 클래스 보다 인터페이스가 더 유연한다.
 *    
 *  
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
    
    //5) 3의 배수 인덱스의 이름을 출력하기
    // => 기존 프로젝트에서 사용했던 클래스를 가져와서 사용하기
    // => ThirdIterator는 기존에 상속 받던 수퍼 클래스를 변경할 필요가 없다.
    // => 그냥 새 규칙만 추가적으로 따르면 된다.
    //    물론 코드를 손 안대고 그대로 사용하면 좋겠지만,
    //    실무에서 그럴 경우는 거의 없다.
    // => 기존 코드를 사용할 때 최소한으로 변경하여 사용할 수 있는 구조가 좋은 프로그램 구조이다.
    // 
    printList(new ThirdIterator(arr));
  }
  
  // printList()가 받는 파라미터는 Iterator 인터페이스 구현객체이다.
  static void printList(Iterator iterator) {
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + ",");
    }
    System.out.println();
  }
}





