/* 주제: 파일을 다루는 도구 - File 사용법, 디렉토리 내용 알아내기2
 */
package step11;

import java.io.File;

public class Exam086_4 {

  public static void main(String[] args) throws Exception {
    File f2 = new File("."); // .(현재폴더), ..(상위폴더)

    File[] list = f2.listFiles();
    for (File item : list) {
      System.out.printf("%s %s\n", 
          item.isDirectory() ? "d":"-", 
          item.getName());
    }
    
  }

}










