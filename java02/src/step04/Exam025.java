// 주제: 반복문 사용 - for (변수 : 배열 또는 컬렉션)
package step04;

public class Exam025 {
  public static void main(String[] args) {
    //1) 배열과 for문
    String[] names = {"홍길동", "임꺽정", "유관순", "이순신", "안중근"};
    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }
    System.out.println("------------------------------");

    //2) 배열과 for문
    for (String name : names) { // 배열에서 차례대로 한 개씩 값을 꺼내준다.
      System.out.println(name);
    }
    System.out.println("------------------------------");

  }

}

/*

*/
