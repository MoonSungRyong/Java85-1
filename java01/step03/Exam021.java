//주제: 메모리를 사용하는 방법 - 메모리에 값 저장3

public class Exam021 {
  public static void main(String[] args) {
    int v1 = 20;
    int v2;
    v2 = v1; // v1 메모리에 들어 있는 값을 변수가 있는 자리에 놓는다.
    // 작동 원리
    //1) v2 = v1;
    //2) v2 = 20;
    //3) v2에 값 20 저장한다.

    System.out.println("v2 = " + v2); // + 의미는 문자열 연결이다.
    System.out.printf("v2 = %d\n", v2);
  }
}

/*
l-value는 반드시 메모리여야 한다.
r-value?
- 값 또는 메모리이다.







*/
