/*문제
1) 문자 배열이 있다. 특정 문자를 다른 문자로 교체하라!
2) 배열 데이터 예:
char[] chars = {'i', 'n', 't', 'e', 'g', 'e', 'r'};
char ch1 = 't';
char ch2 = 'x';
3) 실행 및 출력 예:
>java Test20
결과: inxeger
*/


public class Test20 {
  public static void main(String[] args) {
    char[] chars = {'i', 'n', 't', 'e', 'g', 'e', 'r'};
    char ch1 = 't';
    char ch2 = 'x';

    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == ch1) {
        chars[i] = ch2;
      }
    }

    for (int i = 0; i < chars.length; i++) {
      System.out.print(chars[i]);
    }
    System.out.println();
  }


}




/**/
