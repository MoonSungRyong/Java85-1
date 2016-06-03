//문제: 나이를 입력 받은 후, 미성년, 성년, 중년, 노인으로 분류하라!
// 기준
// 미성년: < 18
// 성년: 18 <= age < 50
// 중년: 50 <= age < 65
// 노인: 65 <= age

public class Test02 {
  public static void main(String[] args) {
    int age = Integer.parseInt(args[0]);
    System.out.printf(" %s\n", (age < 18) ? "미성년" :
      ((age >= 18 && age < 50) ? "성년" :
      ((age >= 50 && age < 65) ? "중년" : "노인")));

  }
}

/*






*/
