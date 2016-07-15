/* 주제: 파일을 다루는 도구 - FileOutputStream/FileInputStream 사용법 
 * => FileOutputStream을 이용하여 데이터 출력 
 */
package step11;

import java.io.File;
import java.io.FileOutputStream;

public class Exam087_1 {

  public static void main(String[] args) throws Exception {
    File f = new File("test01.dat");
    FileOutputStream out = new FileOutputStream(f);
    
    //1) write(int) => 이 메서드는 무조건 1바이트를 출력한다.
    out.write(100); // 0x64  => 실제 출력은 0x64
    out.write(256); // 0x0100 =>  실제 출력은 0x00
    out.write(180243); // 0x02c013 => 실제 출력 0x13
    
    //출력을 종료해야지 제대로 저장을 완료한다.
    out.close();
    System.out.println("저장하였습니다.");
  }

}










