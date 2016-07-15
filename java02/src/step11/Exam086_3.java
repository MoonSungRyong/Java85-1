/* 주제: 파일을 다루는 도구 - File 사용법, 디렉토리 내용 알아내기
 */
package step11;

import java.io.File;

public class Exam086_3 {

  public static void main(String[] args) throws Exception {
    File f2 = new File("."); // .(현재폴더), ..(상위폴더)

    String[] list = f2.list();
    for (String item : list) {
      System.out.println(item);
    }
    
  }

}










