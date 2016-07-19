 /* 주제: 데이터 가공 스트림 클래스 - ObjectOutputStream/ObjectInputStream 사용법
  * => 직렬화된 인스턴스 값 읽기 
  * => 바이트 배열을 읽어서 인스턴스로 생성하는 것. 
 */
package step11;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Exam089_9 {

  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("Exam089_8.dat");
    BufferedInputStream in2 = new BufferedInputStream(in);
    ObjectInputStream in3 = new ObjectInputStream(in2);
    
    Board2 board  = (Board2)in3.readObject();
    
    //붙인 역순으로 닫는다.
    in3.close();
    in2.close();
    in.close();

    System.out.println("실행하였습니다.");
    System.out.println(board);
  }

}

















