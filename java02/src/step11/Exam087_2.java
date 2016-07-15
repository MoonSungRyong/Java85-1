/* 주제: 파일을 다루는 도구 - FileOutputStream/FileInputStream 사용법 
 * => FileInputStream을 이용하여 데이터 출력 
 */
package step11;

import java.io.File;
import java.io.FileInputStream;

public class Exam087_2 {

  public static void main(String[] args) throws Exception {
    File f = new File("test01.dat");
    FileInputStream in = new FileInputStream(f);
    
    int b;
    //1) read():int => 이 메서드는 무조건 1바이트를 읽어들인다.
    b = in.read(); // 리턴 타입이 int라 하더라도, 실제 읽은 값은 1바이트이다.
    System.out.println(Integer.toHexString(b)); // 0x64
    System.out.println(Integer.toHexString(in.read())); // 0x00
    System.out.println(Integer.toHexString(in.read())); // 0x13
    
    //입/출력 도구는 사용 후 반드시 close() 하도록 해라!
    in.close();
    System.out.println("읽었습니다.");
  }

}










