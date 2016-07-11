/* 주제: 상속 - 추상 클래스의 한계
 * => 추상 클래스도 클래스이기 때문에, 
 *    printList()를 호출할 때 파라미터로 넘길 수 있는 객체는
 *    Iterator의 서브 클래스만 가능하다.
 * => 다른 클래스를 상속 받은 서브 클래스 사용은 불가능하다.
 *    기능 확장이 유연하지 못하다.
 *    
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
    
    //5) 3의 배수 인덱스의 이름을 출력하기
    // => 기존 프로젝트에서 사용했던 클래스를 가져와서 사용하기
    //printList(new ThirdIterator(arr)); // 컴파일 오류가 발생한다!
    /* 이유?
     * => ThirdIterator는 Iterator의 서브 클래스가 아니다.
     * 해결 방법?
     * 1) OkIterator의 상속을 포기한다. 대신 Iterator를 상속한다.
     *    => OkIterator로부터 상속 받아 사용한 코드를 모두 재작성해야 한다.
     * 2) ThirdIterator를 파라미터로 받는 printList()를 추가로 만든다.
     *    => 동일한 코드를 중복으로 작성하는 문제가 있다.
     *    => 앞으로 이와 같은 경우가 발생할 때 마다 printList()를 새로 만들 것인가?
     * 2) ThirdIterator를 사용하지 않는다.
     */
  }
  
  static void printList(Iterator iterator) {
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + ",");
    }
    System.out.println();
  }
  
  // 이렇게 해도 된다.
  // => 그런데 앞으로 이런 경우가 발생하면 매번 이렇게 printList()를 추가할 것인가?
  // => 좀 더 나은 해결책은 없는가?
  static void printList(OkIterator iterator) {
    while (iterator.hasMoreElement()) {
      System.out.print(iterator.nextElement() + ",");
    }
    System.out.println();
  }
}





