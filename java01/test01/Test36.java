/*
*/
public class Test36 {
  public static void main(String[] args) throws Exception {
    // 밑변의 삼각형 갯수를 입력 받아서 * 문자로 삼각형을 그려라.
    /*  > java Test36 4
          *
         ***
        *****
    */
    int len = Integer.parseInt(args[0]);
    if (len % 2 == 0) {
      len++;
    }

    int spaceLen = len / 2;
    for (int i = 1; i <= len; i += 2) {
      for (int j = 0; j < spaceLen; j++) {
        System.out.print(" ");
      }
      spaceLen--;
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }
}




/**/
