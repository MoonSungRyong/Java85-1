/* 주제: 스레드 - 멀티 스레드 실행 */
package step14;

public class Exam093_8 {

  public static void main(String[] args) {
    class MyThread extends Thread {
      String flag;
      
      public MyThread(String flag) {
        this.flag = flag;
      }
      
      @Override
      public void run() {
        for (int i = 0; i < 10000; i++) {
          System.out.printf("%s %d\n", flag, i);
        }
      }
    }
    
    MyThread t1 = new MyThread("t1 =>");
    MyThread t2 = new MyThread("t2 ---->");
    MyThread t3 = new MyThread("t3 ~");
    MyThread t4 = new MyThread("t4 }}}");
    
    t1.start(); 
    t2.start();
    t3.start();
    t4.start();
    
    for (int i = 0; i < 10000; i++) {
      System.out.printf("%d\n", i);
    }
  }
}









