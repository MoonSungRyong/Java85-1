// 5단계: 데이터 타입의 연사자로서 메서드를 정의하기
// => Score3에 정의된 메서드들은 외부에서 값을 받아 처리한다.
// => 이 메서드들을 Score3의 데이터를 다루는 연산자로서 정의하고 싶다!
//    => static 메서드 대신 instance 메서드로 정의하라!
package step05.ex02;

public class Test05 {
  public static void main(String[] args) {
    Score4 studentA = new Score4();
    studentA.no = 1;
    studentA.name = "홍길동";
    studentA.scores = new float[]{100f, 100f, 100f};

    Score4 studentB = new Score4();
    studentB.no = 2;
    studentB.name = "임꺽정";
    studentB.scores = new float[]{90f, 90f, 90f};

    // Score4의 sum()과 aver()는 Score4 타입의 데이터를 다루는 연산자이다.
    // 따라서 사용법은 "피연산자.연산자()"
    studentA.sum(); // => i++ 모양과 유사하다.
    studentA.aver();
    System.out.printf("총점: %f\n", studentA.sum);
    System.out.printf("평균: %f\n", studentA.aver);
    System.out.println("----------------------------");

    studentB.sum();
    studentB.aver();
    System.out.printf("총점: %f\n", studentB.sum);
    System.out.printf("평균: %f\n", studentB.aver);
  }
}

/*

*/
