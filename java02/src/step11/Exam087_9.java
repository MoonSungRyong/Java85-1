 /* 주제: 파일을 다루는 도구 - FileOutputStream/FileInputStream 사용법5 
 * => 배열을 사용하지 않고 파일 복사하기 
 */
package step11;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exam087_9 {

  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("jvms8.pdf");
    FileOutputStream out = new FileOutputStream("jvms8_2.pdf");

    long startMillis = System.currentTimeMillis();
    
    int b;
    while ((b = in.read()) != -1) {
      out.write(b);
    }
    
    long endMillis = System.currentTimeMillis();
    
    out.close();
    in.close();
    
    System.out.println(endMillis - startMillis);
  }

}










