/* 주제: 스레드 동기화 - 동기화 적용 전2 */
package step14;

public class Exam094_2 {
  static int count;
  
  static class MyCounter extends Thread {
    public MyCounter(String name) {
      super(name);
    }
    
    @Override
    public void run() {
      for (int i = 0; i < 100; i++) {
        // 작업 중간에 CPU를 빼앗길 틈을 주기 위해
        // 쓸데없는 작업을 집어 넣었다.
        for (int x = 0; x < (Math.random() * 10); x++) {double d = 3.14159 * 34.3456;} // 멈짓
        int temp = count;
        for (int x = 0; x < (Math.random() * 10); x++) {double d = 3.14159 * 34.3456;} // 멈짓
        temp += 1;
        for (int x = 0; x < (Math.random() * 10); x++) {double d = 3.14159 * 34.3456;} // 멈짓
        count = temp;
        System.out.printf("%s => %d\n", this.getName(), count);
      }
    }
  }
  
  public static void main(String[] args) {
    MyCounter t1 = new MyCounter("t1");
    MyCounter t2 = new MyCounter("t2");
    MyCounter t3 = new MyCounter("t3");
    MyCounter t4 = new MyCounter("t4");
    
    t1.start(); 
    t2.start();
    t3.start();
    t4.start();
    
  }
}









