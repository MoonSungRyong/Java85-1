package step09;

public class MyKey2 {
  int v1;
  int v2;
  
  public MyKey2(int v1, int v2) {
    this.v1 = v1;
    this.v2 = v2;
  }

  @Override
  public String toString() {
    return "MyKey2 [v1=" + v1 + ", v2=" + v2 + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + v1;
    result = prime * result + v2;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    MyKey2 other = (MyKey2) obj;
    if (v1 != other.v1)
      return false;
    if (v2 != other.v2)
      return false;
    return true;
  }
}
