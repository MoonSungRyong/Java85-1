// 주제: 사용자 정의 데이터 타입 다루기 - 사용자 정의 연산자 추가하기
package step05;

public class Exam027 {
  static class Student {
    int no;
    float kor;
    float eng;
    float math;

    // 사용자 정의 연산자 추가하기: "메서드"라 부른다.
    // => 가산점 추가하는 연산자
    void addBonus(int score) {
      //내장 변수 this: 연산자를 사용할 때 인스턴스의 주소가 저장된다.
      this.kor += score;
      this.eng += score;
      this.math += score;
    }

    //=> 총점을 계산해주는 연산자
    float sum() {
      return this.kor + this.eng + this.math;
    }

    //=> 평균을 계산해주는 연산자
    float aver() {
      return this.sum() / 3;
    }
  }

  public static void main(String[] args) {
    //1) 타입과 연산자
    // => 데이터 타입마다 그 타입의 값에 대해 사용할 수 있는 연산자가 정의되어 있다.
    float f1 = 3.14f;
    f1++; // ++ 후위 연산자는 float 값에 사용할 수 있다.
    System.out.println(f1);
    //System.out.println(f1 >> 4); // float에 비트 이동 연산자 '>>'가 정의되어 있지 않다.
                                 // 컴파일 오류 발생!


    Student s1 = new Student();
    s1.no = 1;
    s1.kor = 95f;
    s1.eng = 100f;
    s1.math = 97.5f;

    // 학생의 성적 전체에 가산점을 추가하고 싶다!
    // => 하지만 Student에는 가산점을 추가하는 연산자가 정의되어 있지 않다.
    // => 해결책?
    //    Student 데이터 타입에 가산점을 추가시키는 연산자를 정의하면 된다.

    // 사용자 정의 데이터 타입에는 다음과 같이 일반적인 연산자를 추가할 수 없다.
    // s1 += 10; // 불가능!

    // 다음과 같이 문자열과 숫자로 조합된 이름의 연산자를 등록할 수 있다.
    // 그리고 사용법도 다음과 같이 사용해야 한다.
    s1.addBonus(5);

    // 다음의 총점과 합계를 구하는 코드도
    // Student에 연산자를 등록하여 사용하도록 변경하자!
    /*
    float sum = s1.kor + s1.eng + s1.math;
    float aver = sum / 3;
    */

    System.out.printf("총점: %f\n", s1.sum()); // s1에 대해 sum() 연산자 실행
    System.out.printf("평균: %f\n", s1.aver()); // s1에 대해 aver() 연산자 실행

  }

}

/*

*/
