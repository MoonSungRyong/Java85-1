/* 주제: 파일을 다루는 도구 - FileOutputStream/FileInputStream 사용법3 
 * => 바이트 배열 출력 
 */
package step11;

import java.io.FileOutputStream;

public class Exam087_5 {

  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("Exam087_5.dat");
    
    byte[] bytes = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    
    // 바이트 배열 출력 1 => 반복문을 사용하여 1바이트씩 출력 한다.
    for (int i = 0; i < bytes.length; i++) {
      out.write(bytes[i]);
    }
    
    out.close();
    System.out.println("저장하였습니다.");
  }

}










