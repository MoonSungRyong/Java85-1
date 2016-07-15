/* 주제: 파일을 다루는 도구 - File 사용법, 디렉토리 내용 알아내기4
 */
package step11;

import java.io.File;
import java.io.FilenameFilter;

public class Exam086_7 {

  public static void main(String[] args) throws Exception {
    File f2 = new File("."); // .(현재폴더), ..(상위폴더)

    // 현재 폴더의 모든 하위 폴더를 뒤져서, 자바 파일을 출력하라!
    printJavaFile(f2);
  }
  
  static void printJavaFile(File dir) throws Exception {
    File[] list = dir.listFiles(); // 현재 폴더에 있는 모든 파일(파일 + 폴더)을 가져온다.
    for (File file : list) {
      if (file.isFile() && file.getName().endsWith(".java")) {
        System.out.println(file.getCanonicalPath());
      } else if (file.isDirectory()) {
        printJavaFile(file);
      }
    }
  }

}










