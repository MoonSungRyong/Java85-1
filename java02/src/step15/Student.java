// 주제: 필드와 프로퍼티의 구분
package step15;

public class Student {
  String firstName;
  String lastName;
  int age;
  boolean _working;
  String email;
  
  public void setName(String name) {
    String[] values = name.split(" ");
    firstName = values[0];
    lastName = values[1];
  }
  public String getName() {
    return firstName + " " + lastName;
  }
  
  public void setAge(int age) {
    this.age = age;
  }
  
  public int getAge() {
    return this.age;
  }
  
  public void setWork(boolean working) {
    this._working = working;
  }
  
  public boolean isWorking() { // 보통 boolean 값을 리턴하는 메서드는 isXxx()로 이름을 짓는다.
    return this._working;
  }
}

/* 필드(field)
 * => 인스턴스 변수명
 * => firstName, lastName, age, _working, email
 * 
 * 프로퍼티(property)
 * => 겟터/셋터 메서드의 이름
 * => 메서드 이름에서 get/set은 제거하고 첫 알파벳은 소문자로 한 이름
 * => name, age, work(write only), working(read only)
 */












