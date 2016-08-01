package designpatterns.command.after;

import java.util.HashMap;
import java.util.Scanner;

public class CalcTest {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    
    //커맨드 객체 준비
    HashMap<String,Command> commandMap = new HashMap<>();
    commandMap.put("+", new PlusCommand());
    commandMap.put("-", new MinusCommand());
    
    int a, b;
    String op;
    Command command;
    
    while (true) {
      System.out.print("명령> ");
      a = keyScan.nextInt();
      op = keyScan.next();
      b = keyScan.nextInt();
      
      command = commandMap.get(op);
      if (command != null)
        command.execute(a, b);
      else 
        System.out.println("지원하지 않는 연산자입니다!");
    }
  }

}


/* 커맨드 패턴
 * => 메서드를 객체화시킨다.
 * => 즉 메서드를 클래스로 포장한다.
 * => 향후 메서드를 추가할 가능성이 높은 경우,
 *    메서드를 객체화시킴으로써 기능을 추가하기가 쉬워진다.
 * => 왜? 기능이 메서드 단위로 되어 있다면 기능 추가할 때 마다 기존 클래스 코드를 변경해야 한다.
 *        그런데 기능이 메서드 단위가 아니라 클래스 단위로 되어 있다면, 
 *        단지 클래스를 추가함으로써 기존 코드를 손댈 필요없이 기능을 추가할 수 있다.
 */














