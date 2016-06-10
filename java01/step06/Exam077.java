//주제: 기타 - 사용자 도구(method) 추가하기

public class Exam077 {
  public static void main(String[] args) {
    //1) 현재 클래스에 있는 도구 사용하기
    int result = Exam077.plus(10, 20); // plus() 도구 사용
    System.out.println(result);

    //2) 다른 클래스에 있는 도구 사용하기
    int result2 = Other.minus(10, 20);
    System.out.println(result2);
  }

  //1) 정수 값을 2개 받아서 더한 후 그 결과를 리턴하는 도구 정의
  static int plus(int a, int b) {
    int sum = a + b;
    return sum;
  }
}
