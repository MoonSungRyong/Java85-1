/*문제
1) 입력 값으로 문자열과 문자를 받아서,
   문자열에 해당 문자가 몇 개있는 지 세어라!
2) 실행 및 출력 예:
>java Test33 computerscience c
c: 3개
일치하는 문자가 없습니다.
*/


public class Test33 {
  public static void main(String[] args) throws Exception {
    char[] chars = args[0].toCharArray();
    char ch = args[1].charAt(0); // 문자열에서 0번째 문자의 유니코드 값을 리턴한다.

    int count = 0;
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == ch) {
        count++;
      }
    }

    if (count > 0) {
      System.out.printf("%c: %d개\n", ch, count);
    } else {
      System.out.println("일치하는 문자가 없습니다.");
    }
  }
}




/**/
