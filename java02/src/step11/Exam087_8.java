 /* 주제: 파일을 다루는 도구 - FileOutputStream/FileInputStream 사용법4 
 * => 배열을 읽기
 * => 배열을 전문적으로 읽는 메서드를 사용하 
 */
package step11;

import java.io.FileInputStream;

public class Exam087_8 {

  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("Exam087_7.dat");
    
    byte[] bytes = new byte[1024]; //1KB
    int len = in.read(bytes); // read()의 리턴 값은 실제 읽은 바이트의 개수이다.
    
    in.close();
    System.out.println("읽었습니다.");
    for (int x = 0; x < len; x++) {
      System.out.printf("%x ", bytes[x]);
    }
    System.out.println();
  }

}










