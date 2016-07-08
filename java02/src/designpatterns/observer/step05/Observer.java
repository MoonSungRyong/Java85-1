package designpatterns.observer.step05;

public interface Observer {
  // 호출 규칙 => 메서드 시그너처 선언하라!
  //void findWord(String word) {} => 메서드를 구현할 수 없다.
  /*public abstract*/ void findWord(String word); // 무조건 abstract이고, public 이다.
  
  //규칙은 무조건 공개되어야 하기 때문에 public 접근 범위를 갖는다.
  //메서드의 규격만 선언해야 하기 때문에 abstrace 이다.
}
