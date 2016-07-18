 /* 주제: 데이터 가공 스트림 클래스 - DataOutputStream/DataInputStream 사용법
  * DataOuputStream
  * => 자바 원시 타입 데이터를 바이트 배열을 바꿔 출력하는 일을 한다.
  * DataInputStream
  * => 바이트 배열을 읽어 자바 원시 타입 데이터로 복원시키는 일을 한다. 
 */
package step11;

import java.io.FileOutputStream;

public class Exam089_2 {

  public static void main(String[] args) throws Exception {
    //DataOutputStream 사용 전
    FileOutputStream out = new FileOutputStream("Exam089_2.dat");
    
    int value = 0x2a883c65;
    
    //value 변수의 4바이트 값 모두 출력하라!
    out.write(value >> 24); // [0000002a]883c65 => 오른쪽 경계를 넘은 값은 짤린다. 맨 끝 1바이트 출력
    out.write(value >> 16); // [00002a88]3c65   => 오른쪽 경계를 넘은 값은 짤린다. 맨 끝 1바이트 출력
    out.write(value >> 8);  // [002a883c]65     => 오른쪽 경계를 넘은 값은 짤린다. 맨 끝 1바이트 출력
    out.write(value);       // [2a883c65]       => 맨 끝 1바이트 출력
    
    out.close();
    System.out.println("실행하였습니다.");
  }

}

















