package step12.exam02;

public class Patient {
  String name;
  private int age;
  private float weight;
  private float height;
  boolean gender;
  
  // age, weight, height와 같은 인스턴스 변수의 값을 넣을 있도록 도와주는 메서드 => "셋터 메서드"
  // => 이 메서드는 외부에서 접근할 수 있어야 하기 때문에 공개한다.
  public void setAge(int age) {
    if (age > 0 && age < 150)
      this.age = age;
  }
  
  public void setWeight(float weight) {
    if (weight > 0 && weight < 500)
      this.weight = weight;
  }
  
  public void setHeight(float height) {
    if (height > 0 && height < 300)
      this.height = height;
  }
  
  // 인스턴스 변수의 값을 꺼내주는 메서드 => "셋터 메서드"
  public int getAge() {
    return this.age;
  }
  
  public float getWeight() {
    return this.weight;
  }
  
  public float getHeight() {
    return this.height;
  }
}







