// 주제: 변수 사용 - 사용자 정의 데이터 타입
package step02;

public class Exam017 {
  // 개발자가 자신이 사용할 데이터 타입을 정의할 수 있다.
  //1) 데이터 타입 정의
  // => 메모리를 확보한게 아니라 타입을 정의한 것이다.
  static class Student {
    // 이 타입에서 준비해야 할 메모리의 종류 및 각 항목의 이름을 지정한다.
    // 배열의 경우, 각 항목은 인덱스 숫자를 이용하여 지정할 수 있지만,
    // 배열이 아닌 경우는 아래와 같이 각각의 항목에 대해 이름을 지정해야 한다.
    // => 다음 변수 선언은 메모리를 확보하는 명령어가 아니라,
    //    어떤 메모리를 준비해야 하는지에 대한 선언이다.
    int no;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    boolean working;
    char gender;
  }

  public static void main(String[] args) {
    //2) Student 타입의 메모리 주소를 담을 변수를 선언한다.
    Student s; // <== 배열 변수와 같다. 주소를 저장하는 변수이다. 레퍼런스.

    //3) 사용자가 정의한 데이터 타입으로 메모리를 준비해보자!
    s = new Student(); // <== Student에 정의된 것에 따라 메모리를 확보하라는 명령어다.
                       // 리턴 값은 확보된 메모리(인스턴스)의 주소이다.

    //4) 확보한 메모리에 접근하기
    // 메모리를가리키는변수명.메모리의항목이름
    s.no = 1;
    s.kor = 100;
    s.eng = 90;
    s.math = 80;
    s.sum = s.kor + s.eng + s.math;
    s.aver = s.sum / 3f;
    s.working = false;
    s.gender = 'W';

    System.out.printf("번호: %d\n", s.no);
    System.out.printf("합계: %d\n", s.sum);
    System.out.printf("재직여부: %b\n", s.working);
    System.out.printf("성별: %c\n", s.gender);
  }
}

/*
# class 문법의 용도
1) 유사한 기능의 도구들을 묶어 놓는 문법
  예) java01/test01/Array.java
2) 사용자가 임의의 데이터 타입을 정의하는 문법
  예) java02/step02/Exam017.java - Student 클래스

# 배열과 클래스의 차이
- 배열은 같은 타입의 메모리만 준비할 수 있다.
  예) new int[10];
  클래스는 서로 다른 타입의 메모리를 섞어 준비할 수 있다.
  예) new Student();

- 배열은 각 항목을 가리킬 때 인덱스 숫자를 이용한다.
  예)
    int[] arr = new int[10];
    arr[2] = 20;
  클래스는 각 항목에 부여된 이름을 사용한다.
    Student s = new Student();
    s.no = 20;
    s.kor = 100;
    s.working = false;

# 인스턴스
- 클래스에 정의된 대로 준비된 메모리
- 일반적으로 객체(object)라 부르기도 한다.

# 인스턴스 생성
- new 클래스명();

# 객체/개체 (object)
- 프로그램에서는 인스턴스를 가리킬 때 주로 사용한다.
- 하지만 이 용어는 한국 말의 "거시기" 또는 "가"와 비슷한 용도이다.
  즉 문맥에 따라 해석이 다를 수 있다.



*/
