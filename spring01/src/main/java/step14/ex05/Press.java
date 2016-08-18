package step14.ex05;

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
