 /* 주제: 데이터 가공 스트림 클래스 - ObjectOutputStream/ObjectInputStream 사용법3
  * => transient 대상 필드는 출력에서 제외된다.
 */
package step11;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Exam089_12 {

  public static void main(String[] args) throws Exception {
    Score2 s = new Score2();
    s.name = "홍길동";
    s.kor = 100;
    s.math = 50;
    s.eng = 50;
    s.compute();
    
    FileOutputStream out = new FileOutputStream("Exam089_12.dat");
    BufferedOutputStream out2 = new BufferedOutputStream(out); // Decorator
    ObjectOutputStream out3 = new ObjectOutputStream(out2); // Decorator
    
    // 다음과 같이 transient 필드는 값을 조작해봐야 소용없다.
    // 왜? 어차피 출력하지 않기 때문이다.
    s.aver = 90.5f;  
    
    out3.writeObject(s); // OK!
    
    // 닫을 때는 붙인 역순으로 닫는다.
    out3.close();
    out2.close();
    out.close();
    System.out.println("실행하였습니다.");
  }

}

















