// 4단계: 메서드와 데이터 타입의 결합
// => Score2에는 점수를 다루는 메서드와 스태틱 변수가 있다.
// => 유지보수가 좀 더 쉽도록, Score2의 역할을 확대해 보자!
//    Score2 = 메서드를 모아두는 역할
//    Score3 = 메서드를 모아두는 역할 + 데이터 타입의 역할
package step05.ex02;

public class Test04 {
  public static void main(String[] args) {
    //# Score3를 데이터 타입으로서 사용.
    //1) 학생A의 번호와 이름, 점수, 총점, 평균을 저장할 메모리(인스턴스)를 준비하자!
    Score3 studentA = new Score3();
    studentA.no = 1;
    studentA.name = "홍길동";
    studentA.scores = new float[]{100f, 100f, 100f};

    //2) 학생B의 번호와 이름, 점수, 총점, 평균을 저장할 메모리(인스턴스)를 준비하자!
    Score3 studentB = new Score3();
    studentB.no = 2;
    studentB.name = "임꺽정";
    studentB.scores = new float[]{90f, 90f, 90f};

    //# Score3를 메서드를 모아둔 묶음으로 사용
    //1) studentA의 총점 및 평균 출력하기
    Score3.sum(studentA);
    Score3.aver(studentA);
    System.out.printf("총점: %f\n", studentA.sum);
    System.out.printf("평균: %f\n", studentA.aver);
    System.out.println("----------------------------");

    //2) studentB의 총점 및 평균 출력하기
    Score3.sum(studentB);
    Score3.aver(studentB);
    System.out.printf("총점: %f\n", studentB.sum);
    System.out.printf("평균: %f\n", studentB.aver);
  }
}

/*

*/
