package designpatterns.observer.step05;

public class BeCountingObserver implements Observer {
  int words = 0;
  public void findWord(String word) {
    String w = word.toLowerCase();
    if (w.equals("is") || w.equals("are") || w.equals("was") || w.equals("were")
        || w.equals("am") || w.equals("be")) {
      words++;
    }
  }

}
