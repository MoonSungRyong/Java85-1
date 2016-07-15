/* 주제: 파일을 다루는 도구 - File 사용법, 디렉토리 내용 알아내기3
 */
package step11;

import java.io.File;
import java.io.FileFilter;

public class Exam086_5 {

  public static void main(String[] args) throws Exception {
    File f2 = new File("."); // .(현재폴더), ..(상위폴더)

    // 디렉토리만 뽑아내도록 필터를 추가하라! => 익명 이너 클래스를 사용하라!
    File[] list = f2.listFiles(new FileFilter() {
      @Override
      public boolean accept(File pathname) {
        if (pathname.isDirectory())
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










