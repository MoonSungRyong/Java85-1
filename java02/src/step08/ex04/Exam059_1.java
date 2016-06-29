/* 주제: 상속 - 클래스 로딩 조건 */
package step08.ex04;

public class Exam059_1 {
  public static void main(String[] args) {
    // 레퍼런스 변수 선언은 클래스를 로딩할 필요가 없다.
    // => 실행하기 전에 User.class, Student.class, Student2.class 파일을 제거한다.
    // => 실행해보라! => 실행오류가 발생하지 않는다.
    User user;
    Student student;
    Student2 student2;
  }
}









