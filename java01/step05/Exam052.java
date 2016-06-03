//주제: 명령어 흐름을 제어하는 문법 - 명령어들의 묶음(block)

public class Exam052 {
  public static void main(String[] args) {
    System.out.println("aaa");

    { // 블록 안이라고 해서 특별할 것 없다.
      // 그냥 순서대로 실행된다.
      System.out.println("bbb");
    }

    System.out.println("ccc");
  }
}

/*
블록의 종류
1) 클래스 블록
   - 예) class Hello {...}
2) 메서드 블록
   - 예) void main() {...}
3) 제어문 블록
   - 예) if () {...}
   - 예) if () {...} else {...}
   - 예) switch () {...}
   - 예) do {...} while ();
   - 예) while () {...}
   - 예) for () {...}
3) 일반 블록
   - 다른 블록 안에 작성하는 블록
   - 예) {...}

블록의 특징
- 블록 안에서 만든 메모리는 블록을 벗어나면 사용할 수 없다.
- 블록 밖에 만든 변수는 그 블록 안에서 사용할 수 있다.



*/
