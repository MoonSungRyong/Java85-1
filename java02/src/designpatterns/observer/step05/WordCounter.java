package designpatterns.observer.step05;

import java.util.ArrayList;

public class WordCounter {
  ArrayList<Observer> observers = new ArrayList<>();
  
  public int count(String str) {
    int words = 0;
    boolean charFlag = false;
    StringBuffer wordBuf = new StringBuffer(); // 워드를 저장하는 용도
    
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ') {
        if (charFlag) {
          words++;
          charFlag = false;
          callObserver(wordBuf.toString());
          wordBuf.setLength(0); // 새 단어를 저장하기 위해 버퍼를 초기화시킨다.
        }
        continue;
      }
      charFlag = true;
      wordBuf.append(str.charAt(i)); // 버퍼에 문자 저장
    }
    
    if (charFlag) {
      words++;
      callObserver(wordBuf.toString());
    }
    
    return words;
  }

  // 반복되는 코드는 메서드로 뽑아낸다.
  private void callObserver(String word) {
    for (Observer observer : observers) {
      observer.findWord(word);
    }
  }
  
  public void addObserver(Observer observer) {
    observers.add(observer);
  }
}










