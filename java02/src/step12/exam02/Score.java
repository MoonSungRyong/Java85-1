package step12.exam02;

public class Score {
  String name;
  int kor;
  int math;
  int eng;
  
  // sum과 aver는 외부에서 마음대로 접근하지 못하게 막는다.
  private int sum;
  private float aver;
  
  // 대신 합계를 계산하는 메서드를 둔다.
  // 그 메서드는 공개한다.
  public void compute() {
    this.sum = this.kor + this.math + this.eng;
    this.aver = this.sum / 3f;
  }
  
  // 외부에서 sum과 aver 변수이 값을 가져갈 수 있도록 메서드를 제공한다.
  // 당연히 그 메서드는 공개되어야 한다.
  public int getSum() {
    return this.sum;
  }
  
  public float getAver() {
    return this.aver;
  }
  
}







