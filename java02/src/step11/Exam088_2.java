 /* 주제: 파일을 다루는 도구 - FileWriter/FileReader 사용법 
 * => 읽기 
 */
package step11;

import java.io.FileReader;

public class Exam088_2 {

  public static void main(String[] args) throws Exception {
    FileReader in = new FileReader("test03.dat");
    
    int b;
    //1) read():int => 영어는 1바이트, 그 밖의 문자는 2바이트 또는 3바이트를 읽는다.
    //   => 유니코드로 변환하여 리턴한다.
    b = in.read(); 
    System.out.println(Integer.toHexString(b));         // 0x64     ==> 0x0064
    System.out.println(Integer.toHexString(in.read())); // 0xc480   ==> 0x0100
    System.out.println(Integer.toHexString(in.read())); // 0x64     ==> 0x0064
    System.out.println(Integer.toHexString(in.read())); // 0xEC8093 ==> 0xC013
    System.out.println(Integer.toHexString(in.read())); // 0x64     ==> 0x0064
    System.out.println(Integer.toHexString(in.read())); // 0x41     ==> 0x0041
    System.out.println(Integer.toHexString(in.read())); // 0x64     ==> 0x0064
    System.out.println(Integer.toHexString(in.read())); // 0xEAB080 ==> 0xAC00
    System.out.println(Integer.toHexString(in.read())); // 0x64     ==> 0x0064
    System.out.println(Integer.toHexString(in.read())); // 0x39     ==> 0x0039
    
    //입/출력 도구는 사용 후 반드시 close() 하도록 해라!
    in.close();
    System.out.println("읽었습니다.");
  }

}










