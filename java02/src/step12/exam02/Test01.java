/* 주제: 캡슐화 문법 사용 후 */
package step12.exam02;

public class Test01 {

  public static void main(String[] args) {
    Score s = new Score();
    s.name = "홍길동";
    s.kor = 100;
    s.math = 90;
    s.eng = 100;
    
    // 합계와 평균을 구하기 위해 직접 계산하기 보다는 제공되는 메서드를 호출한다.
    s.compute();

    // sum과 aver 변수는 직접 접근할 수 없기 때문에 
    // 제공되는 메서드를 사용하여 값을 가져온다.
    //System.out.printf("합계: %d, 평균: %.2f\n", s.sum, s.aver); // 접근 불가!
    
    System.out.printf("합계: %d, 평균: %.2f\n", s.getSum(), s.getAver());
    
    // 만약 사용자(개발자를 말함)가 임의로 sum이라든가 aver 변수에 접근하려 한다면,
    // 컴파일 오류 발생!
    //s.sum = 100; // 컴파일 오류!
    //s.aver = 30f; // 컴파일 오류!
    
    // 이렇게 sum과 aver 변수에 대해 임의로 접근하는 것을 막음으로써
    // sum과 aver 값의 신뢰성은 보장받는다. 
    // 따라서 Score 클래스를 정의한 목적(추상화)대로 정상적으로 사용할 수 있다.
  }

}

/* "겟터 메서드(getter)"
 * => getSum(), getAver()와 같이 인스턴스 변수의 값을 꺼내주는 메서드를 말한다.
 */















