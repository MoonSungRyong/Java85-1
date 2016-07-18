/* 주제: 파일을 다루는 도구 - FileOutputStream/FileInputStream 사용법2 
 * => 문자 출력 
 */
package step11;

import java.io.FileOutputStream;

public class Exam087_3 {

  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("test02.dat");
    
    // '문자' => 2바이트 유니코드 값을 리턴한다.
    out.write('A');    // 0x0041 => 실제 출력은 0x41
    out.write('가');   // 0xAC00 => 실제 출력은 0x00
    out.write('9');    // 0x0039 => 실제 출력은 0x39
    
    //출력을 종료해야지 제대로 저장을 완료한다.
    out.close();
    System.out.println("저장하였습니다.");
  }

}










