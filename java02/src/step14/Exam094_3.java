/* 주제: 스레드 동기화 - 동기화 적용 후 */
package step14;

public class Exam094_3 {
  static class Account {
    long balance;
    
    public Account(long balance) {
      this.balance = balance;
    }
    
    // 다음 메서드에는 여러 스레드가 동시에 진입했을 때 문제가 있는 코드들이 들어있다.
    // => "크리티컬 섹션(Critical Section, Critical Region)"이라 부른다.
    // => 즉 Thread Safe 하지 않다는 얘기다.
    // => 여러 스레드가 공유하는 변수를 조회하는 코드가 아닌 변수의 값을 바꾸는 코드가 있을 경우,
    //    스레드 안전하지 않다고 말한다.
    // => 해결책? 한 번에 한 스레드만이 진입하게 만들면 된다.
    //            즉 Mutex(뮤텍스)를 적용하라. 다른 말로 Semaphore(1)로 만들라!
    // => Semaphore(n) : 크리티컬 섹션에 n개의 스레드 진입을 허용하는 것을 말한다. 
    // => synchronized가 붙은 블록은 오직 한 번에 한 스레드만이 진입할 수 있다.
    synchronized public int withdraw(int money) {
      long temp = balance;
      temp -= money;
      if (temp < 0)
        return 0;
      balance = temp;
      return money;
    }
  }
  
  static class ATM extends Thread {
    Account account;
    
    public ATM(Account account, String threadName) {
      super(threadName);
      this.account = account;
    }
    
    @Override
    public void run() {
      long sum = 0;
      int money = 0;
      for (int i = 0; i < 1000; i++) {
        money = account.withdraw(10000);
        if (money == 0)
          break;
        sum += money;
      }
      System.out.printf("%s: %d원\n", this.getName(), sum);
    }
  }
  
  public static void main(String[] args) {
    Account account = new Account(10000000);
    
    ATM t1 = new ATM(account, "강남");
    ATM t2 = new ATM(account, "영등포");
    ATM t3 = new ATM(account, "서초");
    ATM t4 = new ATM(account, "홍대");
    
    t1.start(); 
    t2.start();
    t3.start();
    t4.start();
    
  }
}









