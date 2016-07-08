package designpatterns.observer.step04;

public class WordCounter {
  // 특정 클래스를 지칭하는 대신, 규격에 맞는다면 어떤 클래스의 객체라도 
  // 담을 수 있는 변수를 선언하라!
  Observer observer; // => Observer 규칙에 따라 만든 클래스의 인스턴스 주소를 담겠다!
  
  public int count(String str) {
    int words = 0;
    boolean charFlag = false;
    StringBuffer wordBuf = new StringBuffer(); // 워드를 저장하는 용도
    
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ') {
        if (charFlag) {
          words++;
          charFlag = false;
          
          // 워드를 한 개 찾았다면 옵저버에게 보고하자!
          if (observer != null) { // 옵저버가 파견나와 있다면,
            observer.findWord(wordBuf.toString());
          }
          
          wordBuf.setLength(0); // 새 단어를 저장하기 위해 버퍼를 초기화시킨다.
        }
        continue;
      }
      charFlag = true;
      wordBuf.append(str.charAt(i)); // 버퍼에 문자 저장
    }
    
    if (charFlag) {
      words++;

      if (observer != null) { 
        observer.findWord(wordBuf.toString());
      }
    }
    
    return words;
  }

  public void addObserver(Observer observer) {
    this.observer = observer;
  }
}










