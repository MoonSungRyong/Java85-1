package step10;

public class Author {
  String name;
  String email;
  String tel;
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getTel() {
    return tel;
  }
  public void setTel(String tel) {
    this.tel = tel;
  }
  @Override
  public String toString() {
    return "Author [name=" + name + ", email=" + email + ", tel=" + tel + "]";
  }
  
  
}
