package designpatterns.observer.step02;

public class WordCounter {

  public int count(String str) {
    int words = 0;
    boolean charFlag = false;
    
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ') {
        if (charFlag) {
          words++;
          charFlag = false;
        }
        continue;
      }
      charFlag = true;
    }
    
    if (charFlag) {
      words++;
    }
    
    return words;
  }
}
