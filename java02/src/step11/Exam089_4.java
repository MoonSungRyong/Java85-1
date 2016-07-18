 /* 주제: 데이터 가공 스트림 클래스 - DataOutputStream/DataInputStream 사용법2
  * DataOuputStream
  * => 자바 원시 타입 데이터를 바이트 배열을 바꿔 출력하는 일을 한다.
  * DataInputStream
  * => 바이트 배열을 읽어 자바 원시 타입 데이터로 복원시키는 일을 한다. 
 */
package step11;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Exam089_4 {

  public static void main(String[] args) throws Exception {
    //DataOutputStream 사용 후
    FileOutputStream out = new FileOutputStream("Exam089_4.dat");
    DataOutputStream out2 = new DataOutputStream(out);
    
    int value = 0x2a883c65;

    // FileOutputStream을 직접 사용하지 말고,
    // DataOutputStream을 사용해서 int 값을 출력하면 
    // 코딩이 훨씬 쉬워진다.
    out2.writeInt(value); 
    
    out.close();
    System.out.println("실행하였습니다.");
  }

}

















