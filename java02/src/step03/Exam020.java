// 주제: 연산자 사용 - 비트 논리 연산자 활용
package step03;

public class Exam020 {
  public static void main(String[] args) {
    // 홍길동은 다음 프로그래밍 언어 중에서 php, javascript, java, swift를
    // 프로그래밍 할 수 있다.
    // 홍길동이 프로그래밍 가능한 언어를 다음 배열에서 찾아
    // 그 번호를 저장하라! php(7), javascript(9), java(3), swift(12)
    // 프로그래밍 언어:
    String[] langs = {
        "c", "c++", "c#", "java", "basic",
        "pascal", "perl", "php", "python", "javascript",
        "cobol", "fortran", "swift", "objectivec", "ada",
        "smalltalk"};

    int c = 0x1,        // 0000 0000 0000 0001
        cpp = 0x2,      // 0000 0000 0000 0010
        cs = 0x4,       // 0000 0000 0000 0100
        java = 0x8,     // 0000 0000 0000 1000
        basic = 0x10,   // 0000 0000 0001 0000
        pascal = 0x20,  // 0000 0000 0010 0000
        perl = 0x40,    // 0000 0000 0100 0000
        php = 0x80,     // 0000 0000 1000 0000
        python = 0x100, // 0000 0001 0000 0000
        javascript = 0x200, // 0000 0010 0000 0000
        cobol = 0x400,      // 0000 0100 0000 0000
        fortran = 0x800,    // 0000 1000 0000 0000
        swift = 0x1000,     // 0001 0000 0000 0000
        objectivec = 0x2000,// 0010 0000 0000 0000
        ada = 0x4000,       // 0100 0000 0000 0000
        smalltalk = 0x8000; // 1000 0000 0000 0000

    // 비트 연산자를 사용하여 여러 개의 상태 정보를
    // 한 변수 안에 저장할 수 있다.
    int language = php | javascript | java | swift;
    /*
    php:        0000 0000 1000 0000
    javascript: 0000 0010 0000 0000
    java:       0000 0000 0000 1000
    swift:      0001 0000 0000 0000
    ---------------------------------
                0001 0010 1000 1000 (0x1288)
    */
    System.out.println(Integer.toBinaryString(language));

    // 비트 연산자를 사용하면,
    // 변수에 저장된 값 중에서 특정 상태의 값을 알아내기 쉽다.
    // => 특정 비트의 값이 1인지 알고 싶을 때 비트 AND 연산을 이용한다.
    System.out.printf("자바? %b\n", ((language & java) == java) ? true : false);
  }
}

/*

*/
