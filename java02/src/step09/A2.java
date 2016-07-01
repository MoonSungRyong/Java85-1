package step09;

public class A2 /*extends Object*/ {
  int var1 = 100;
  
  //1) toString() 재정의 
  // => toString()은 인스턴스의 간략한 정보를 리턴한다.
  // => Object로부터 상속받은 오리지널 메서드는 너무 코드스러운 문자열을 리턴한다.
  // => 의미있는 문자열을 리턴하도록 재정의하겠다.
  @Override
  public String toString() {
    return "A[var1=" + this.var1 + "]";
  }
}
