package step14.ex07;

import org.springframework.stereotype.Component;

// 이 경우처럼 굳이 객체 이름이 필요 없으면 생략하라!
// 그러면 "전체클래스명#0" 으로 자동 명명된다.
@Component
public class Press {
  String name;
  String tel;
  
  public Press() {
    System.out.println("Press()");
  }
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    System.out.println("setName()");
    this.name = name;
  }
  public String getTel() {
    return tel;
  }
  public void setTel(String tel) {
    System.out.println("setTel()");
    this.tel = tel;
  }
  
  @Override
  public String toString() {
    return "Press [name=" + name + ", tel=" + tel + "]";
  }
  
  
  
}
