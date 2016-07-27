/* 주제: 스레드 - 스레드 만들기1 */
package step14;

public class Exam093_3 {

  public static void main(String[] args) {
    //1) 스레드 정의 - Thread 클래스 상속 받기
    class MyThread extends Thread {
      @Override
      public void run() {
        // 스레드가 할 일을 기술한다.
        for (int i = 0; i < 10000; i++) {
          System.out.printf("=> %d\n", i);
        }
      }
    }
    
    //2) 스레드 생성
    MyThread t = new MyThread();
    
    //3) 스레드 실행
    t.start();  // MyThread의 run() 메서드 실행을 요청한다. 그리고 즉시 리턴한다.
    
    // "main" 스레드가 실행하는 코드
    for (int i = 0; i < 10000; i++) {
      System.out.printf("%d\n", i);
    }
    
  }

}













