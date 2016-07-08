package designpatterns.observer.step02;

import java.util.Scanner;

public class MainApp {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    
    System.out.print("문장을 입력하세요> ");
    String str = keyScan.nextLine();
    
    WordCounter counter = new WordCounter();
    int words = counter.count(str);
    System.out.printf("단어 개수: %d\n", words);
    
    keyScan.close();
  }
}







