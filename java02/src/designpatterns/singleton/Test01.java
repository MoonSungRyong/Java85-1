package designpatterns.singleton;

public class Test01 {

  public static void main(String[] args) {
    //1) A의 클래스 객체 생성
    A obj1 = new A();
    A obj2 = new A();
    A obj3 = new A();
    
    // 일반적으로 인스턴스를 생성하고 싶은 만큼 생성할 수 있다.
    // 그러나 실무에서는 가끔 인스턴스를 한 개만 생성할 수 있도록 
    // 제약을 가해야 할 때가 있다.
    // 방법은?
    // => 생성자를 외부에서 호출할 수 없도록 private으로 접근을 제한한다.
    // => 객체를 한 번 생성하면 보관해두었다가 다음에 호출할 때 그 객체를 리턴한다.
    // 이런 설계 기법을 "싱글톤(Singleton)"이라 한다.
    
    // 생성자가 private이기 때문에 외부에서 생성자를 호출할 수 없다.
    // 따라서 다음과 같은 방법으로 객체를 생성할 수 없다.
    //B obj4 = new B(); // 컴파일 오류!
    
    B obj5 = B.getInstance();
    B obj6 = B.getInstance();
    B obj7 = B.getInstance();
    
    if (obj5 == obj6) 
      System.out.println("obj5 == obj6");
    if (obj5 == obj7) 
      System.out.println("obj5 == obj7");
  }

}






