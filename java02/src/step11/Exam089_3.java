 /* 주제: 데이터 가공 스트림 클래스 - DataOutputStream/DataInputStream 사용법
  * DataOuputStream
  * => 자바 원시 타입 데이터를 바이트 배열을 바꿔 출력하는 일을 한다.
  * DataInputStream
  * => 바이트 배열을 읽어 자바 원시 타입 데이터로 복원시키는 일을 한다. 
 */
package step11;

import java.io.FileInputStream;

public class Exam089_3 {

  public static void main(String[] args) throws Exception {
    //DataInputStream 사용 전
    FileInputStream in = new FileInputStream("Exam089_2.dat");
    
    // 파일에 저장된 4바이트 int 값을 value 변수에 저장하라!
    int value;
    value = in.read() << 24;
    value += in.read() << 16;
    value += in.read() << 8;
    value += in.read();

    
    
    in.close();
    
    System.out.printf("%x\n", value);
    System.out.println("실행하였습니다.");
  }

}

















