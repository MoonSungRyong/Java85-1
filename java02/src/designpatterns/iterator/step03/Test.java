/* 주제: 상속 - generalization 소개
 * => 서브 클래스들의 중복 변수나 메서드를 추출하여 수퍼 클래스로 정의하는 것. 
 * => 수퍼 클래스의 메서드
 *   - 서브 클래스에게 "메서드의 이름과 파라미터 타입, 개수" 등을 강제하는 효과를 준다.
 *   
 * => 메서드 시그너처(method signature)
 *   - 메서드의 이름, 파라미터 타입, 개수, 리턴 타입을 말한다.
 *   - C/C++에서는 function prototype이라 부른다.
 */ 
package designpatterns.iterator.step03;

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
  }
  
  //다형적 변수(polymorphic variables)
  // => 서브 객체도 가리킬 수 있다.
  // => 서브 클래스의 객체도 가리킬 수 있다.
  // => 서브 클래스의 인스턴스 주소도 저장할 수 있다.
  static void printList(Iterator iterator) {
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + ",");
    }
    System.out.println();
  }
}





