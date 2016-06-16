package step05.ex02;

public class Test00 {
  public static void main(String[] args) {
    int no = 1;
    float kor = 95f;
    float eng = 100f;
    float math = 97.5f;

    int bonusScore = 5;
    kor += bonusScore;
    eng += bonusScore;
    math += bonusScore;

    float sum = kor + eng + math;
    float aver = sum / 3;

    System.out.printf("총점: %f\n", sum);
    System.out.printf("평균: %f\n", aver);
  }

}

/*

*/
