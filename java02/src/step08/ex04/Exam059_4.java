/* 주제: 상속 - 클래스 로딩 횟수
 * => 딱 한 번만 로딩된다.
 */
package step08.ex04;

public class Exam059_4 {
  public static void main(String[] args) {
    Student student, student2;

    // 1) User 클래스 로딩 
    // 2) Student 클래스 로딩
    // 3) 인스턴스 생성
    student = new Student();
    System.out.println("----------------------");
    
    // 클래스는 한 번 로딩되면 다시 로딩되지 않는다.
    student2 = new Student();
    
  }
}









