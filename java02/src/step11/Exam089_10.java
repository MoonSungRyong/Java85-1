 /* 주제: 데이터 가공 스트림 클래스 - ObjectOutputStream/ObjectInputStream 사용법2
  * => 인스턴스 값을 모두 출력할 때 문제점
  * => 예)
  *    합계와 평균은 국,영,수 점수를 계산해 구한다.
  *    그런데 출력 데이터에 합계와 평균을 그냥 출력하게 되면
  *    보내는 쪽에서 조작할 수 있다.
 */
package step11;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Exam089_10 {

  public static void main(String[] args) throws Exception {
    Score s = new Score();
    s.name = "홍길동";
    s.kor = 100;
    s.math = 50;
    s.eng = 50;
    s.compute();
    
    FileOutputStream out = new FileOutputStream("Exam089_10.dat");
    BufferedOutputStream out2 = new BufferedOutputStream(out); // Decorator
    ObjectOutputStream out3 = new ObjectOutputStream(out2); // Decorator
    
    s.aver = 90.5f; // 유효하지 않은 평균 값을 저장한 후 출력한다. 
    out3.writeObject(s); // OK!
    
    // 닫을 때는 붙인 역순으로 닫는다.
    out3.close();
    out2.close();
    out.close();
    System.out.println("실행하였습니다.");
  }

}

















