/* 문제:
=> 왼쪽 변의 길이를 입력받아 다음과 같이 출력하라!
=> 예) 왼쪽 변의 길이가 8이라면,
*
**
***
****
*****
****
***
**
*

*/
public class Test37 {
  public static void main(String[] args) throws Exception {
    int len = Integer.parseInt(args[0]);
    if (len % 2 == 0) {
      len++;
    }

    int starLen = 1;
    for (int i = 0; i < len; i++) {
      for (int j = 0; j < starLen; j++) {
        System.out.print("*");
      }
      System.out.println();
      if (i < len / 2) {
        starLen++;
      } else {
        starLen--;
      }
    }


  }
}




/**/
