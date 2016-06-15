// 주제: 사용자 정의 데이터 타입 다루기 - 새 데이터 타입 정의하기
package step05;

public class Exam026 {
  //1) 새 데이터 타입 정의
  static class Student {
    int no;
    float kor;
    float eng;
    float math;
  }

  public static void main(String[] args) {
    //2) Student 메모리의 주소를 저장할 변수 선언
    // => "레퍼런스(reference)"라 부른다.
    Student s1;

    //3) Student 타입의 메모리를 준비한다.
    // => "인스턴스(instance)"라 부른다.
    s1 = new Student();

    //4) 메모리에 값을 저장한다.
    s1.no = 1;
    s1.kor = 95f;
    s1.eng = 100f;
    s1.math = 97.5f;

    //5) 총점과 평균을 출력한다.
    float sum = s1.kor + s1.eng + s1.math;
    float aver = sum / 3;
    System.out.printf("총점: %f\n", sum);
    System.out.printf("평균: %f\n", aver);

  }

}

/*

*/
