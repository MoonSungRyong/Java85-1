/* 주제: 랩퍼 클래스 - 오토 박싱(auto-boxing) 지원
 * 오토 박싱?
 * => 원시 타입의 데이터를 자동으로 랩퍼 클래스의 인스턴스로 만드는 것. 
 */
package step09;

public class Exam070_3 {
  public static void main(String[] args) throws Exception {
    // obj1 => 레퍼런스 변수. Integer 인스턴스의 주소를 저장하는 변수.
    // new Integer(20) => 20을 저장할 Integer 인스턴스를 생성한다.
    Integer obj1 = new Integer(20);
    
    String s = "hello"; // new String("hello")
    
    // 다음은 오토 박싱의 예이다.
    Integer obj2 = 20; // new Integer(20) => 원시 타입의 값을 랩퍼 클래스 인스턴스로 자동 포장한다.
  }

}



















