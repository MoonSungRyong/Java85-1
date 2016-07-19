 /* 주제: 데이터 가공 스트림 클래스 - ObjectOutputStream/ObjectInputStream 사용법
  * => 인스턴스의 값을 출력하자! 
  * => 인스턴스 값을 바이트 배열로 만드는 것.
 */
package step11;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Exam089_8 {

  public static void main(String[] args) throws Exception {
    Board board = new Board("제목입니다.", "내용입니다.", "1111");
    board.no = 1;
    
    Board2 board2 = new Board2("제목입니다.", "내용입니다.", "1111");
    board2.no = 1;
    
    FileOutputStream out = new FileOutputStream("Exam089_8.dat");
    BufferedOutputStream out2 = new BufferedOutputStream(out); // Decorator
    ObjectOutputStream out3 = new ObjectOutputStream(out2); // Decorator
    
    //out3.writeObject(board); // 실행 오류! Serialize 대상이 아니다.
    out3.writeObject(board2); // OK!
    
    // 닫을 때는 붙인 역순으로 닫는다.
    out3.close();
    out2.close();
    out.close();
    System.out.println("실행하였습니다.");
  }

}

/* Serialize(=Marshaling)
 * => 인스턴스 값을 바이트 배열로 만드는 것.
 * 
 * Deserialize(=Unmarshaling)
 * => 바이트 배열을 인스턴스로 만드는 것.
 * 
 * 주의!
 * => JVM은 Serialize가 허용된 객체에 대해서만 직렬화(serialize)를 수행한다.
 * => 일반 객체는 serialize 할 수 없다.
 * => 이유? 무분별한 인스턴스의 출력을 막기 위해.
 *          인스턴스의 값을 손쉽게 밖으로 내보내는 것은 보안상 위험하다.
 * => 개발자가 인스턴스의 직렬화를 허용하는 문법
 *    class 클래스명 implements Serializable {...}
 * 
 * java.io.Serializable 인터페이스
 * => 인스턴스의 직렬화를 허용하는 표시자로 기능을 한다.
 * => 특별히 메서드를 갖고 있지 않다.
 * => 따라서 이 인터페이스를 구현하는 클래스는 별도의 메소드를 구현할 필요가 없다.
 * 
 */















