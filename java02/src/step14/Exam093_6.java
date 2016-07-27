/* 주제: 스레드 - 스레드의 생명주기(lifecycle) */
package step14;

public class Exam093_6 {

  public static void main(String[] args) {
    class MyThread extends Thread {
      @Override
      public void run() {
        for (int i = 0; i < 10000; i++) {
          System.out.printf("=> %d\n", i);
        }
        
        // start()는 재실행시킬 수 없다.
        //this.start(); // 실행 오류!
      }
    }
    
    MyThread t = new MyThread();
    t.start(); 
    
    for (int i = 0; i < 10000; i++) {
      System.out.printf("%d\n", i);
    }
    
  }

}

/* 스레드의 생명주기
 *                      
 * new MyThread()     start()                  sleep()/wait()
 *     New ---------------------> Runnable -----------------------> Not Runnable
 *                                   |     <-----------------------
 *                                   |         timeout/nofify(),notifyAll()
 *                                   |
 *                                   | run() 메서드 실행이 완료!
 *                                   |
 *                                   v
 *                                 Dead  
 * 
 * 1) Runnable 상태?
 *    => CPU를 배정 받은 상태이거나 또는 받을 수 있는 상태
 *    => CPU 쟁탈전(racing)에 놓인 상태
 *    => 이전 초기상태(New 상태)로 돌아갈 수 없다.
 * 
 * 2) Not Runnable 상태?
 *    => CPU를 배정 받을 수 없는 상태
 *    => CPU 배정 대상에서 제외됨
 *    => Runnable 상태에서 sleep() 또는 wait()를 호출하면 이 상태로 전이된다.
 *    => 지정된 시간이 지나거나 notify() 또는 notifyAll()로 신호가 들어오면 
 *       다시 Runnable 상태로 전이한다.
 * 
 * 3) Dead 상태
 *    => 스레드의 run() 메서드 실행이 끝난 상태.
 *    => 이전의 Runnable 상태나 New 상태로 돌아갈 수 없다.
 *       재활용 불가!
 *    => 한 번 start() 한 것을 또 start() 시킬 수 없다.
 *        
 */











