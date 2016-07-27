/* 주제: 스레드 - Not Runnable 상태로 만들기 */
package step14;

public class Exam093_7 {

  public static void main(String[] args) {
    class MyThread extends Thread {
      @Override
      public void run() {
        for (int i = 0; i < 10000; i++) {
          System.out.printf("=> %d\n", i);
          if (i == 1200) {
            // 5초 동안 Not Runnable 상태로 만든다.
            // => 즉 Not Runnable 상태에서 5초가 지나면(타입아웃되면) 다시 Runnable 상태가 된다.
            try {sleep(5000);} catch (Exception e) {}
          }
        }
      }
    }
    
    MyThread t = new MyThread();
    t.start(); 
    
    for (int i = 0; i < 10000; i++) {
      System.out.printf("%d\n", i);
    }
    
    // main 스레드의 자식 스레드인 MyThread가 작업을 끝낼 때까지 JVM은 실행을 종료하지 않는다.
    
    // 자식 스레드?
    // A 스레드 안에서 B 스레드를 생성했다면 B 스레드는 A 스레드의 자식 스레드가 된다.
    // 따라서 MyThread는 main 스레드의 자식 스레드이다.
    
  }

}









