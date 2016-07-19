/* 주제: 캡슐화 문법 - 멤버의 접근 제어
 * => private : 클래스 멤버만 접근 가능
 * => (default) : 클래스 멤버 + 같은 패키지의 클래스 
 * => protected : 클래스 멤버 + 같은 패키지의 클래스 + 자식 클래스 
 * => public : 모두 접근 가능 
 */
package step12.exam03;

public class C {
  private int v1;
  int v2;
  protected int v3;
  public int v4;
  
  public void m() {
    this.v1 = 10;
    this.v2 = 20;
    this.v3 = 30;
    this.v4 = 40;
  }
}
