 /* 주제: 데이터 가공 스트림 클래스 - DataOutputStream/DataInputStream 사용법3
  * => 인스턴스 값 읽기  
 */
package step11;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class Exam089_7 {

  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("Exam089_6.dat");
    BufferedInputStream in2 = new BufferedInputStream(in);
    DataInputStream in3 = new DataInputStream(in2);
    
    Board board  = new Board();
    
    // 읽을 때는 쓴 순서대로 그대로 읽어야 한다.
    board.no = in3.readInt();
    board.title = in3.readUTF();
    board.contents = in3.readUTF();
    board.password = in3.readUTF();
    board.createdDate = in3.readUTF();
    board.viewCount = in3.readInt();
    
    //붙인 역순으로 닫는다.
    in3.close();
    in2.close();
    in.close();

    System.out.println("실행하였습니다.");
    System.out.println(board);
  }

}

















