// 주제: 소스 파일과 .class 파일 분리하여 관리
public class Exam002 {
  public static void main(String[] args) {
    System.out.println("Hello, world!");
  }
}

/*
# 소스 파일과 .class 파일을 분리하기
> javac -d 디렉토리경로 소스파일경로
예)
> javac -encoding UTF-8 -d bin src/Exam002.java (for Windows)
> javac -d bin src/Exam002.java (for Mac, Linux, Unix)
src/Exam002.java
bin/Exam002.class

# 다른 폴더에 있는 .class 파일 실행하기
> java -classpath 디렉토리경로 클래스명
> java -cp 디렉토리경로 클래스명
예)
> java -classpath bin Exam002
> java -cp bin Exam002

*/
