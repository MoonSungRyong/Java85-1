/* 주제: 랩퍼 클래스 - 오토 언박싱(auto-unboxing)
 * 오토 언박싱
 * => 인스턴스의 값을 자동으로 꺼내 주는 것.
 */
package step09;

public class Exam070_5 {
  public static void main(String[] args) throws Exception {
    Integer obj = new Integer(30);
    
    int value = obj.intValue();
    int value2 = obj; // 자동으로 intValue()가 호출되어 그 리턴 값이 value2에 저장된다.
                      // 박스에 저장된 데이터를 푼다라는 의미에서 "auto-unboxing"이라 부른다.
    
    // 연습
    //1) 오토 박싱의 예
    Integer obj2 = 10; // new Integer(10);
    Object obj3 = 10;  // new Integer(10);
    
    //2) 오토 언박싱의 예
    int value3 = obj2;
    //int value4 = obj3; // Object 타입에 대해서는 오토 언박싱이 자동으로 일어나지 않는다.
    int value5 = (Integer)obj3; // 형변환을 해야 한다.
    int value6 = (int)obj3;     // 직접 원시 타입으로 형변환을 할 수 있다.
                                // 단 obj3에 Integer 객체가 저장되었다는 가정하에서.
  }

}



















