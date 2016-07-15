/* 주제: 파일을 다루는 도구 - File 사용법, 디렉토리 정보 알아내기
 */
package step11;

import java.io.File;

public class Exam086_2 {

  public static void main(String[] args) throws Exception {
    File f = new File(""); // 폴더 또는 파일을 지정하지 않을 경우,
    
    System.out.println(f.exists());       // false
    System.out.println(f.isDirectory());  // false
    System.out.println(f.isFile());       // false
    System.out.println(f.getCanonicalPath()); // 기본으로 현재 폴더 경로를 리턴한다.
    System.out.println(f.getAbsolutePath());  // 기본으로 현재 폴더 경로를 리턴한다.
    System.out.println("-----------------------------");
    
    File f2 = new File("."); // .(현재폴더), ..(상위폴더)
    System.out.println(f2.exists());
    System.out.println(f2.isDirectory());
    System.out.println(f2.isFile());
    System.out.println(f2.getCanonicalPath());
    System.out.println(f2.getAbsolutePath());
  }

}










