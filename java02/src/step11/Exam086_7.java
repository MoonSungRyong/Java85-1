/* 주제: 파일을 다루는 도구 - File 사용법, 디렉토리 내용 알아내기4
 */
package step11;

import java.io.File;
import java.io.FilenameFilter;

public class Exam086_7 {

  public static void main(String[] args) throws Exception {
    File f2 = new File("."); // .(현재폴더), ..(상위폴더)

    // 현재 폴더의 모든 하위 폴더를 뒤져서, 자바 파일을 출력하라!
    File[] list = f2.listFiles(new FilenameFilter() {
      @Override
      public boolean accept(File dir, String name) {
        if (name.endsWith(".java"))
          return true;
        return false;
      }
    });
    
    for (File item : list) {
      System.out.printf("%s %s\n", 
          item.isDirectory() ? "d":"-", 
          item.getName());
    }
    
  }

}










