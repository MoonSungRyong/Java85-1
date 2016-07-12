package step10.exam085;

public class A4 {
  void m() {
    final int a; // 로컬 변수는 초기화 되지 않는다.
    a = 10; // 여기서 처음으로 초기화 된다.
    a = 20; // 일단 값이 저장되면 값을 바꿀 수 없다.
  }
}
