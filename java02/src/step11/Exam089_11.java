 /* 주제: 데이터 가공 스트림 클래스 - ObjectOutputStream/ObjectInputStream 사용법2
  * => 계산한 결과를 담은 인스턴스 변수의 값을 읽을 때 문제점
  * => 데이터를 출력할 때 계산 결과를 유효하지 않은 값으로 변경하더라도 알 수 없다. 
 */
package step11;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Exam089_11 {

  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("Exam089_10.dat");
    BufferedInputStream in2 = new BufferedInputStream(in);
    ObjectInputStream in3 = new ObjectInputStream(in2);
    
    Score s  = (Score)in3.readObject();
    
    // 출력 결과를 보라! 평균 값은 조작된 값이다.
    // 저장된 객체의 값을 읽을 때, 조작된 값을 읽을 가능성을 최소화시키는 것이 필요하다.
    // 해결책? 
    // => 기존 인스턴스의 변수 값을 가지고 계산해서 나오는 값은 
    //    직렬화 대상에서 제외하는 것이 좋다.
    // => 읽는 쪽에서 다시 계산하는 것이 데이터 신뢰성을 높이는 방법이다.
    
    
    //붙인 역순으로 닫는다.
    in3.close();
    in2.close();
    in.close();

    System.out.println("실행하였습니다.");
    System.out.println(s);
  }

}

















