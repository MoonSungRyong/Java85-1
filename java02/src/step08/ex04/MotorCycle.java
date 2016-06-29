package step08.ex04;

public class MotorCycle extends Motor {
  int muffler;
  
  //이 클래스는 기본 생성자가 없다.
  // why? 생성자가 단 한 개라도 있으면 컴파일러는 기본 생성자를 자동으로 추가하지 않는다.
  
  public MotorCycle(int muffler) {
    this.muffler = muffler;
  }
}
