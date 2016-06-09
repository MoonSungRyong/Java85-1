/*문제
1) 주어진 문자열의 알파벳의 개수를 센다.
2) 실행 및 출력 예:
>java Test21 circleofnumbers
b:1
c:2
e:2
f:1
i:1
l:1
m:1
n:1
o:1
r:2
s:1
u:1

3) 힌트
- 입력 받은 문자열을 문자 배열로 만든다.
- 알파벳의 개수를 저장할 int 배열을 준비한다.
- 개수가 1이상인 것만 출력한다.
- 인덱스를 가지고 어떤 문자인지 알아낸다.

*/


public class Test22 {
  public static void main(String[] args) {
    char[] chars = args[0].toUpperCase().toCharArray();
    int[] counts = new int[26];

    // 알파벳 개수를 0으로 초기화
    for (int i = 0; i < counts.length; i++) {
      counts[i] = 0;
    }

    // 알파벳을 센다.
    for (int i = 0; i < chars.length; i++) {
      counts[chars[i] - 'A']++;
    }

    // 알파벳의 개수를 출력
    for (int i = 0; i < counts.length; i++) {
      if (counts[i] <= 0)
        continue;
      System.out.printf("%c: %d\n", (char)(i + 'A'), counts[i]);
    }
  }


}




/**/
