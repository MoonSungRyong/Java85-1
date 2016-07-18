/* 주제: 파일을 다루는 도구 - FileWriter/FileReader 사용법 
 * => 출력하기 
 */
package step11;

import java.io.FileWriter;

public class Exam088_1 {

  public static void main(String[] args) throws Exception {
    FileWriter out = new FileWriter("test03.dat");
    
    //1) write(int)
    // => 파라미터 값이 유니코드라고 가정한다.
    //    FileOutputStream과 다르게 4바이트 파라미터 값 중에서
    //    끝에 2바이트를 출력한다.
    //    단, 그냥 출력하지 않고 다음 공식에 따라 출력한다.
    // => 유니코드를 OS 기본 문자집합으로 변환하여 출력한다.
    //    예) A => 0x0041(유니코드) => 0x41(출력값)
    //    예) 가 => 0xAC00(유니코드) => 0xEAB080(UTF-8), 0xB0A1(MS949)
    //                        값     => Windows OS(MS949), MacOS(UTF-8)   
    out.write(100);    // 0x00000064 => 0x64             , 0x64
    out.write(256);    // 0x00000100 => 0x3f             , 0xC480
    out.write(100);    // 0x00000064 => 0x64             , 0x64
    out.write(180243); // 0x0002c013 => 0x97D3,          , EC8093
    
    // FileOutputStream과 출력 내용을 비교해보라!
    out.write(100);    // 0x00000064 => 0x64             , 0x64
    out.write('A');    // 0x00000041 => 0x41             , 0x41
    out.write(100);    // 0x00000064 => 0x64             , 0x64
    out.write('가');   // 0x0000AC00 => 0xB0A1           , EAB080
    out.write(100);    // 0x00000064 => 0x64             , 0x64
    out.write('9');    // 0x00000039 => 0x39             , 0x39
    
    //출력을 종료해야지 제대로 저장을 완료한다.
    out.close();
    System.out.println("저장하였습니다.");
    System.out.printf("%d, %x\n", (int)'가', (int)'가');
    System.out.printf("%d, %x\n", (int)'핳', (int)'핳');
  }

}










