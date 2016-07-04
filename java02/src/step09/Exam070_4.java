/* 주제: 랩퍼 클래스 - 랩퍼 클래스와 상수 객체, equals()
 */
package step09;

public class Exam070_4 {
  public static void main(String[] args) throws Exception {
    //1) 리터럴로 인스턴스 생성(오토 박싱)
    Integer obj1 = 20; // String처럼 상수 저장소에 인스턴스를 생성한다.
    Integer obj2 = 20; // 기존에 생성된 인스턴스 주소를 리턴한다.
    if (obj1 == obj2) {
      System.out.println("obj2 == obj2");
    }
    if (obj1.equals(obj2)) {
      System.out.println("obj1.equals(obj2)");
    }
    
    //2) 직접 new 연산자를 이용하여 인스턴스 생성
    Integer obj3 = new Integer(30);  // 힙에 인스턴스 생성한다.
    Integer obj4 = new Integer(30);  // 힙에 인스턴스 생성한다.
    if (obj3 == obj4) { // 주소가 다르다.
      System.out.println("obj3 == obj4");
    }
    if (obj3.equals(obj4)) { // 내용은 같다.
      System.out.println("obj3.equals(obj4)");
    }
  }

}



















