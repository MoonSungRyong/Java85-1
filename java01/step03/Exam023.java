//주제: 메모리를 사용하는 방법 - 문자 값 저장

public class Exam023 {
  public static void main(String[] args) {
    char v1 = 0x41;   // 'A'의 유니코드(UTF-16) 값
    char v2 = 0xAC00; // '가'의 유니코드(UTF-16) 값
    char v3 = 0x31;   // '1'의 유니코드(UTF-16) 값
    char v4 = '공'; // '공'의 유니코드(UTF-16) 값
    //1) v4 = '공';
    //2) v4 = 44277; <-- 공 이라는 문자의 유니코드 값이 그 자리에 놓인다.
    //3) v4 메모리에 저장되는 값은 44277이다.

    System.out.printf("v1 = %c\n", v1);
    System.out.printf("v2 = %c\n", v2);
    System.out.printf("v3 = %c\n", v3);
    System.out.printf("v4 = %c\n", v4);
    System.out.printf("v4 = %d\n", (int)v4);
  }
}

/*
%c의 의미?
- 코드 값을 출력하는 것이 아니라,
  코드에 해당되는 문자를 찾아서 문자를 출력하라는 의미.





*/
