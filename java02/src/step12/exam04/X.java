package step12.exam04;

public class X {
  public static void main(String[] args) {
    // public 으로 공개된 클래스는 외부에서 접근 가능!
    step12.exam03.A obj = new step12.exam03.A();
    
    // public 이 안붙은 클래스는 외부 패키지에서 접근 불가능!
    //step12.exam03.B obj2 = new step12.exam03.B(); // 컴파일 오류!
  }
}
