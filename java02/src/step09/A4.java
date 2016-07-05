package step09;

public class A4 /*extends Object*/ {
  int var1 = 100;
  
  @Override
  public String toString() {
    return "A[var1=" + this.var1 + "]";
  }
  
  @Override
  public boolean equals(Object obj) {
    //obj 변수에 A3객체가 넘어올 것이기 때문에 형변환 하여 사용하라!
    A4 other = (A4)obj;
    if (this.var1 == other.var1) {
      return true;
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    // 오리지널 hashCode()는 인스턴스 변수 값에 상관없이 
    // 무조건 각 인스턴스 마다 고유의 식별코드를 리턴한다.
    // => 재정의!
    // 같은 값을 갖는 인스턴스는 같은 해시코드를 리턴하게 만들어 보자!
    return this.var1;
  }
}
