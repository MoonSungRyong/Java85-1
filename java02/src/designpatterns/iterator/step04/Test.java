/* 주제: 상속 - 추상 클래스 및 추상 메서드 소개
 * "추상클래스"
 * => 서브 클래스에게 공통 변수나 메서드를 물려주는 역할만 수행한다.
 * => 따라서 인스턴스를 생성하지 못하도록 막아야 한다.
 * => 추상 클래스를 인스턴스를 생성할 수 없다.
 * 
 * "추상메서드"
 * => 무조건 서브 클래스에서 오버라이딩 해야 하는 메서드라면 수퍼 클래스에서
 *    정의할 필요가 없다.
 * => 메서드의 몸체(body)를 생성할 필요가 없다.
 * => 메서드 앞에 abstract 붙여 추상 메서드로 만들라!
 * => 추상 메서드는 다른 부차적인 효과가 있는데,
 *    추상 메서드를 상속 받은 서브 클래스는 반드시 구현해야 한다.
 *    즉 오버라이딩을 강제할 수 있다. 
 */ 
package designpatterns.iterator.step04;

public class Test {
  public static void main(String[] args) {
    String[] arr = {
        "홍길동", "임꺽정", "이순신", "유관순", "안중근", "윤봉길", "김구",
        "안창호", "강감찬", "장보고", "을지문덕"
    };
    
    // 생성해봐야 의미 없는 Iterator를 다음과 같이 직접 사용하려할 때 문제 발생!
    // => Iterator는 서브 클래스에 공통 변수나 메서드를 물려주는 역할만 하기 때문이다.
    // => 아래와 같이 사용하는 것을 막을 방법은? 
    //    클래스 선언부에 abstract 키워드를 붙여 인스턴스를 생성하지 못하도록 하라! 
    //printList(new Iterator());
    
    //1) 이름을 순서대로 출력하기
    printList(new AscIterator(arr));
    
    //2) 이름을 역순으로 출력하기
    printList(new DescIterator(arr));
    
    //3) 홀수 인덱스의 이름을 출력하기
    printList(new OddIterator(arr));
    
    //4) 짝수 인덱스의 이름을 출력하기
    printList(new EvenIterator(arr));
    
    
  }
  
  static void printList(Iterator iterator) {
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + ",");
    }
    System.out.println();
  }
}





