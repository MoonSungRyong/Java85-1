/* 주제: 스레드 동기화 - 동기화 적용 전 */
package step14;

public class Exam094_1 {
  static class Account {
    long balance;
    
    public Account(long balance) {
      this.balance = balance;
    }
    
    public int withdraw(int money) {
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









