package designpatterns.singleton;

// Singleton 설계 적용
// 1) 생성자를 private으로 접근 제한한다.
// 2) 객체를 생성하는 스태틱 메서드를 만든다.
// 3) 한 번 만든 객체는 스태틱 변수에 보관하여,
//    다음에 요청할 때 생성된 객체를 리턴하도록 한다.
public class B {
  static B instance;
  
  private B() {}
  
  // 객체를 리턴해줄 메서드
  public static B getInstance() {
    if (instance == null) {
      instance = new B(); // 클래스의 모든 멤버는 private 멤버를 사용할 수 있다.
    }
    return instance; 
  }
  
}
