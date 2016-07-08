/* 주제: WordCounter와 옵서버 사이에 호출 규칙을 정의 
 * 인터페이스 문법
 * => 두 객체 사이에 호출 규칙을 정의할 때 사용하는 문법이다.
 * => 인터페이스 규칙을 따라 작성하는 클래스는 반드시 
 *    인터페이스에 선언된 모든 메서드를 만들어야 한다. 
 */
package designpatterns.observer.step04;

import java.util.Scanner;

public class MainApp {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    
    System.out.print("문장을 입력하세요> ");
    String str = keyScan.nextLine();
    
    WordCounter counter = new WordCounter();
    
    //1) MyObserver 생성
    MyObserver observer = new MyObserver();
    //2) 옵저버(관찰자)를 WordCounter에 등록한다.
    // MyObserver는 Observer 규칙에 따라 만든 클래스이기 때문에
    // addObserver() 메서드의 파라미터 값으로 넘길 수 있다.
    counter.addObserver(observer);
    
    int words = counter.count(str);
    System.out.printf("단어 개수: %d\n", words);
    
    System.out.printf("관사 a의 개수: %d\n", observer.words);
    
    keyScan.close();
  }
}







