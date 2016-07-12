package step10.exam085;

public class A2 {
  // 메서드 앞에 final을 붙이면,
  // => 서브 클래스에서 재정의하지 말라는 의미다.
  // => 왜? 
  //    보안을 깨뜨릴 수 있기 때문에.
  //    또는 중요한 메서드로서 재정의 해서는 안되는 경우.
  public final void m() {
    
  }
}
