package step08.ex04;

public class Trike extends MotorCycle {
  int capacity;

  // 생성자를 선언하지 않으면 컴파일러는 자동으로 다음 기본 생성자를 추가한다.
  // => 컴파일 오류 발생!
  //    이유? 기본 생성자의 첫 명령문이 수퍼 클래스의 기본 생성자를 호출하는 것이다.
  //          문제는 Trike의 수퍼 클래스 MotorCycle에는 기본 생성자가 없다.
  /*
  public Trike() {
    super();
  }
  */
  
  // 해결책? 개발자가 직접 수퍼 클래스에 존재하는 생성자를 호출하도록 
  //         명령어를 작성해야 한다.
  public Trike() {
    super(1); // MotorCycle(int) 생성자를 호출한다.
  }
}
