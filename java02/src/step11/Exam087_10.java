 /* 주제: 파일을 다루는 도구 - FileOutputStream/FileInputStream 사용법6 
 * => 배열을 사용하여 파일 복사하기 
 * => 1바이트씩 읽어서 복사하는 것 보다 속도가 빠르다.
 */
package step11;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exam087_10 {

  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("jvms8.pdf");
    FileOutputStream out = new FileOutputStream("jvms8_2.pdf");

    long startMillis = System.currentTimeMillis();
    
    byte[] bytes = new byte[8192];
    int len = 0;
    
    while ((len = in.read(bytes)) != -1) {
      out.write(bytes, 0, len);
    }
    
    long endMillis = System.currentTimeMillis();
    
    out.close();
    in.close();
    
    System.out.println(endMillis - startMillis);
  }

}










