package designpatterns.observer.step03;

public class MyObserver {
  int words = 0;
  public void findWord(String word) {
    System.out.println("==>" + word);
    
    if (word.equals("a")) {
      words++;
    }
  }

}
