 /* 주제: 파일을 다루는 도구 - FileOutputStream/FileInputStream 사용법7 
 * => 배열 단위로 바이트를 읽고 쓰는 "보조 도구" 사용하기
 */
package step11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exam087_11 {

  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("jvms8.pdf");
    BufferedInputStream in2 = new BufferedInputStream(in);
    
    FileOutputStream out = new FileOutputStream("jvms8_3.pdf");
    BufferedOutputStream out2 = new BufferedOutputStream(out);
    
    long startMillis = System.currentTimeMillis();
    
    int b;
    
    while ((b = in2.read()) != -1) {
      out2.write(b);
    }
    
    long endMillis = System.currentTimeMillis();
    
    // BufferedOutputStream의 close()는 
    // 버퍼에 남아 있는 데이터를 파일로 내보내는 기능을 수행하기 때문에
    // 반드시 호출해야 한다.
    out2.close();
    out.close();
    in2.close();
    in.close();
    
    System.out.println(endMillis - startMillis);
  }

}










