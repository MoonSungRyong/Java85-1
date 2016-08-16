package step03;

import org.springframework.stereotype.Component;

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
    this.name = name;
  }
  public String getTel() {
    return tel;
  }
  public void setTel(String tel) {
    this.tel = tel;
  }
  
  @Override
  public String toString() {
    return "Press [name=" + name + ", tel=" + tel + "]";
  }
  
  
  
}
