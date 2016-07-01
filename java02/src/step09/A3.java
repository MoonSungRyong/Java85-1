package step09;

public class A3 /*extends Object*/ {
  int var1 = 100;
  
  @Override
  public String toString() {
    return "A[var1=" + this.var1 + "]";
  }
  
  @Override
  public boolean equals(Object obj) {
    //obj 변수에 A3객체가 넘어올 것이기 때문에 형변환 하여 사용하라!
    A3 other = (A3)obj;
    if (this.var1 == other.var1) {
      return true;
    }
    return false;
  }
}
