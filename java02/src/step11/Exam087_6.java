 /* 주제: 파일을 다루는 도구 - FileOutputStream/FileInputStream 사용법3 
 * => 배열을 읽기 
 */
package step11;

import java.io.FileInputStream;

public class Exam087_6 {

  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("Exam087_5.dat");
    
    // 1) 읽을 바이트의 개수를 정확하게 알고 있다면 다음과 같이 
    //    배열의 크기를 정확하게 지정할 수 있다.
    //byte[] bytes = new byte[10];
    
    // 2) 만약 읽을 바이트의 개수를 정확하게 알고 있지 않다면 
    //    다음과 같이 넉넉하게 배열 메모리를 준비하라!
    byte[] bytes = new byte[1024]; //1KB
    int i = 0;
    // 읽을 바이트의 개수를 정확히 알고 있다면 for 문을 사용할 수 있지만,
    // 읽을 바이트의 개수를 정확히 알고 있지 않다면 while 문을 이용하는 것이 좋다.
    int b;
    while (true) {
      b = in.read();
      if (b == -1) { // read()의 리턴 값이 -1이면 읽을 데이터가 없다는 뜻이다.
        break;
      }
      bytes[i++] = (byte)b;
    }
    
    in.close();
    System.out.println("읽었습니다.");
    for (int x = 0; x < i; x++) {
      System.out.printf("%x ", bytes[x]);
    }
    System.out.println();
  }

}










