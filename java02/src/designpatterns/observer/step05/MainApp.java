/* 주제: 컬렉션 객체를 이용하여 여러 개의 옵서버를 관리하기  
 */
package designpatterns.observer.step05;

import java.util.Scanner;

public class MainApp {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    
    System.out.print("문장을 입력하세요> ");
    String str = keyScan.nextLine();
    
    WordCounter counter = new WordCounter();
    
    // 기존 클래스에 특정 기능을 수행하는 코드를 추가하는 것이 아니라,
    // 별도의 객체를 만들어서 등록하기 때문에,
    // 코드의 유지보수가 좋다.
    MyObserver observer = new MyObserver();
    counter.addObserver(observer);
    
    // 또한 필요할 때 기능을 마음대로 추가할 수 있는 이점이 있다.
    BeCountingObserver observer2 = new BeCountingObserver();
    //counter.addObserver(observer2);
    
    int words = counter.count(str);
    System.out.printf("단어 개수: %d\n", words);
    System.out.printf("관사 a의 개수: %d\n", observer.words);
    //System.out.printf("be 동사의 개수: %d\n", observer2.words);
    
    keyScan.close();
  }
}







