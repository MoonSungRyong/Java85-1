/* 주제: 스레드 - 스레드 만들기2 */
package step14;

public class Exam093_4 {

  public static void main(String[] args) {
    //1) 스레드 정의 - Runnable 인터페이스 구현하기
    class MyJob implements Runnable {
      @Override
      public void run() {
        // 스레드가 할 일(독립적으로 동시에 실행할 코드)을 기술한다.
        for (int i = 0; i < 10000; i++) {
          System.out.printf("=> %d\n", i);
        }
      }
    }
    
    //2) 스레드가 실행할 때 사용할 객체를 생성
    MyJob job = new MyJob();
    
    //3) 스레드 실행
    Thread t = new Thread(job);
    t.start();  // 생성자에서 받은 MyJob 객체의 run() 메서드 실행을 요청한다. 그리고 즉시 리턴한다.
    
    // "main" 스레드가 실행하는 코드
    for (int i = 0; i < 10000; i++) {
      System.out.printf("%d\n", i);
    }
    
  }

}













