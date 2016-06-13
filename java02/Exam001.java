// 주제: 소스 파일과 .class 파일 분리 전

public class Exam001 {
  public static void main(String[] args) {
    System.out.println("Hello, world!");
  }
}

/*
# 컴파일하기
>javac 소스파일
Exam001.java --> Exam001.class

## -encoding 문자집합
- Windows OS에서 자바 소스 파일을 컴파일하는 경우,
  소스 파일이 UTF-8로 되어 있다면 컴파일러에게 알려줘야 한다.
- 만약 알려주지 않으면 자바 소스 파일이 OS 기본 문자집합인 MS949로 되어 있다
  간주하고 컴파일 할 것이다.
- 컴파일
>javac -encoding UTF-8 Exam001.java

- 컴파일을 하면, 소스 파일과 같은 폴더에 .class 파일을 생성한다.


# 용어 정리

## 컴파일
- 자바 소스를 기계어로 바꾸는 것
- 자바 컴파일러는 JVM이 실행할 명령 코드를 생성한다.

## 컴파일러
- 컴파일을 수행하는 프로그램.
  예) javac.exe

## 바이트코드
- 컴파일을 통해 생성된 코드
- JVM이 이해할 수 있는 명령 코드이다.
- 일련의 바이트 데이터로 되어 있다.

## .class 파일
- 컴파일을 통해 생성된 바이트코드를 저장하고 있는 파일
- 자바 소스 코드에서 한 개의 클래스 당 한 개의 .class 파일이 생성된다.

## JVM(Java Virtual Machine)
- .class 파일에 저장된 바이트코드를 실행하는 프로그램이다.
  예) java.exe

*/
