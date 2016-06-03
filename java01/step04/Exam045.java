//주제: main() 파라미터 사용법

public class Exam045 {
  public static void main(String[] args) {
    // args는 .class를 실행할 때 클래스 이름 뒤에 오는 
    // 프로그램 아규먼트 배열을 가리키는 변수이다.
    //예) java Exam045 aaa bbb a b c
    // => String[] args = {"aaa", "bbb", "a", "b", "c"}
    System.out.println(args.length);
    System.out.println(args[0]);
    System.out.println(args[1]);
    System.out.println(args[2]);
    System.out.println(args[3]);
    System.out.println(args[4]);
  }
}

/*
# 파라미터(parameter)?
- 명령어 블록에 전달된 값을 받는 변수.

# 아규먼트(argument)?
- 명령어 블록에 전달하는 값.

예)
int plus(int a, int b) {
  return a + b;
}

int sum = plus(10, 20);

파라미터: a, b
아규먼트: 10, 20








*/
