 /* 주제: 데이터 가공 스트림 클래스 - ObjectOutputStream/ObjectInputStream 사용법3
  * => transient 대상 필드의 값이 비어 있음을 확인한다.
  *  
 */
package step11;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Exam089_13 {

  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("Exam089_12.dat");
    BufferedInputStream in2 = new BufferedInputStream(in);
    ObjectInputStream in3 = new ObjectInputStream(in2);
    
    Score2 s  = (Score2)in3.readObject();
    System.out.println(s);
    // 출력 결과를 보라! transient 필드(sum, aver)의 값이 비어 있다.
    // sum과 aver 필드는 읽는 쪽에서 다시 계산해야 한다.
    // => 그래야 데이터 신뢰성이 높아진다.
    s.compute();
    System.out.println(s);
    
    
    //붙인 역순으로 닫는다.
    in3.close();
    in2.close();
    in.close();

    System.out.println("실행하였습니다.");
  }

}

















