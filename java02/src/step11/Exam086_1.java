/* 주제: 파일을 다루는 도구 - File 사용법 
 * File?
 * => File System을 다루는 도구
 * => File System? 디렉토리와 파일을 관리하는 시스템
 * => 디렉토리 또는 파일을 정보를 다룰 수 있다.
 */
package step11;

import java.io.File;

public class Exam086_1 {

  public static void main(String[] args) throws Exception {
    // 파일 정보 다루기 
    // => 경로를 지정하는 방법 
    // 1) 절대 경로
    //    => 전체 경로를 지정한다.
    //    예) c:\Users\BitCamp\test\a.txt   <== Windows OS
    //    예) /Users/test/a.txt             <== Unix, MacOS, Linux
    // 2) 상대 경로
    //    => 현재 위치를 기준으로 경로를 지정한다.
    //    예) test/a.txt
    //    => 이클립스에서 실행할 때, 상대 경로는 프로젝트 폴더이다.
    //    예) board.dat  ==> c:\Users\BitCamp\workspace\java02\board.dat
    File f = new File("board.dat");
    
    System.out.println(f.exists());
    System.out.println(f.isDirectory());
    System.out.println(f.isFile());
    System.out.println(f.getCanonicalPath());
    System.out.println(f.getAbsolutePath());
    System.out.println("-----------------------------");
    
    // 문제: 다음은 java01 프로젝트에 있는 test53.java 파일의 
    //       캐노니컬 경로와 절대 경로를 출력하는 코드이다. 
    //       new File("") 코드를 완성하시오!
    //       단, 상대 경로로 지정해야 한다.
    File f2 = new File("../java01/test01/test53.java");
    System.out.println(f2.getCanonicalPath());
    System.out.println(f2.getAbsolutePath());
  }

}










