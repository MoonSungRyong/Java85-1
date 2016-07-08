package step10.exam081;

public interface Test01 {
//1) public static final 변수 선언 가능 : 순서는 상관없다. 
  public static final int CONST_V1 = 100;
  //private static final int CONST_V2 = 200; // 컴파일 오류! public 만 가능
  static final int CONST_V3 = 300; // public 이 생략된 것임.
  public final int CONST_V4 = 400; // static 이 생략된 것임.
  public static int CONST_V5 = 500; // final 이 생략된 것임.
  int CONST_V6 = 600; // public static final 이 생략된 것임.
  
//2) public abstract 메서드 선언 가능
  public abstract void m1();
  abstract void m2(); // public 생략됨.
  public void m3(); // abstract 생략됨.
  void m4(); //public abstract 생략됨.
  //private void m5(); // 컴파일 오류! 규칙이기 때문에 무조건 공개해야 한다. 그래서 public 만 가능.
  //void m6() {} // 컴파일 오류! 규칙은 메서드 시그너처만 가져야 한다. 구체적으로 정의해서는 안된다.
}








