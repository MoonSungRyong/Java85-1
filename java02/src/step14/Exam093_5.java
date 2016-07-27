/* 주제: 스레드 - 스레드 만들기3 */
package step14;


// 실무에서는 주로 Runnable 인터페이스를 구현하는 방식으로 스레드를 구동시키다.
// 왜? Thread 클래스를 상속 받는 방법 보다 더 유연하기 때문이다.
//     인터페이스는 어떤 클래스든지 구현할 수 있지 않느냐!
//     바로 다음 클래스처럼....
public class Exam093_5 implements Runnable {

  @Override
  public void run() {
    // 스레드가 할 일(독립적으로 동시에 실행할 코드)을 기술한다.
    for (int i = 0; i < 10000; i++) {
      System.out.printf("=> %d\n", i);
    }
  }
  
  public static void main(String[] args) {
    //2) 스레드가 실행할 때 사용할 객체를 생성
    Exam093_5 job = new Exam093_5();
    
    //3) 스레드 실행
    Thread t = new Thread(job);
    t.start();  // 생성자에서 받은 Exam093_5 객체의 run() 메서드 실행을 요청한다. 그리고 즉시 리턴한다.
    
    // "main" 스레드가 실행하는 코드
    for (int i = 0; i < 10000; i++) {
      System.out.printf("%d\n", i);
    }
    
  }

}













