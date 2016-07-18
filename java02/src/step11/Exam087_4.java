 /* 주제: 파일을 다루는 도구 - FileOutputStream/FileInputStream 사용법2 
 * => 문자 읽기 
 */
package step11;

import java.io.FileInputStream;

public class Exam087_4 {

  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("Exam087_3.dat");
    
    int b;
    //1) read():int => 이 메서드는 무조건 1바이트를 읽어들인다.
    b = in.read(); // 리턴 타입이 int라 하더라도, 실제 읽은 값은 1바이트이다.
    System.out.println(Integer.toHexString(b)); // 0x41
    System.out.println(Integer.toHexString(in.read())); // 0x00
    System.out.println(Integer.toHexString(in.read())); // 0x39
    
    //입/출력 도구는 사용 후 반드시 close() 하도록 해라!
    in.close();
    System.out.println("읽었습니다.");
  }

}










