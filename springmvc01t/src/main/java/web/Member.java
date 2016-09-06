package web;

public class Member {
  String name;
  int age;
  boolean gender;
  String tel;
  String email;
  int weight;
  int height;
  
  @Override
  public String toString() {
    return "Member [name=" + name + ", age=" + age + ", gender=" + gender + ", tel=" + tel + ", email=" + email
        + ", weight=" + weight + ", height=" + height + "]";
  }
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public boolean isGender() {
    return gender;
  }
  public void setGender(boolean gender) {
    this.gender = gender;
  }
  public String getTel() {
    return tel;
  }
  public void setTel(String tel) {
    this.tel = tel;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public int getWeight() {
    return weight;
  }
  public void setWeight(int weight) {
    this.weight = weight;
  }
  public int getHeight() {
    return height;
  }
  public void setHeight(int height) {
    this.height = height;
  }
  
  
}
