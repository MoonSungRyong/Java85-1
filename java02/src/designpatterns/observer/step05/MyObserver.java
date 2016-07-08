package designpatterns.observer.step05;

// 이제 호출 규칙에 따라 옵서버를 만들어야 한다.
// 문법: class 클래스명 implements 규칙명 {...}
//
public class MyObserver implements Observer {
  int words = 0;
  public void findWord(String word) {
    if (word.equals("a")) {
      words++;
    }
  }

}
