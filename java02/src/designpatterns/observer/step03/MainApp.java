package designpatterns.observer.step03;

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
    counter.addObserver(observer);
    
    int words = counter.count(str);
    System.out.printf("단어 개수: %d\n", words);
    
    keyScan.close();
  }
}







