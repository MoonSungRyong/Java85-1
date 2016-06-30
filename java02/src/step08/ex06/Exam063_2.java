/* 주제: 다형성(polymorphism) - 다형적 변수
 */
package step08.ex06;

public class Exam063_2 {
  public static void main(String[] args) {
    // r1은 Motor 타입이지만 Car 인스턴스 주소를 담을 수 있다.
    // 이유? Car는 Motor의 모든 기능을 상속받았기 때문에, Motor로 사용할 수 있다.
    // 문법: 레퍼런스는 서브 클래스의 인스턴스를 가리킬 수 있다.
    Motor r1 = new Car();
    
    // Car 인스턴스는 Motor의 모든 것을 갖고 있기 때문에 Motor 처럼 사용할 수 있다.
    r1.cc = 100; // OK
    r1.maker = "비트자동차"; //OK
    
    Car r2 = new SUV(); // OK
    // SUV 인스턴스도 Car의 모든 것을 갖고 있기 때문에 Car 처럼 사용할 수 있다.
    r2.cc = 100;
    r2.maker = "비트자동차";
    r2.capacity = 4;
    
    // 자식 클래스의 레퍼런스는 수퍼 클래스 인스턴스를 가리킬 수 있는가?
    // => 허락하지 않는다. 컴파일 오류!
    // => 왜? 수퍼 클래스의 인스턴스는 하위 클래스가 가져야할 변수나 멤서드가 없을 수 있기 때문이다.
    /*
    SUV r3 = new Car(); // 만약 이 문장을 허락한다면,
    
    r3.cc = 100;
    r3.maker = "비트컴퓨터";
    r3.capacity = 5;
    r3.weight = 800; // <===== 이 명령을 어떻게 처리할 것인가?
    */
    
    Motor r4 = new Motor();
    Motor r5 = new Car();
    Motor r6 = new SUV();
    
    //Car r7 = new Motor();// 오류!
    Car r8 = new Car();
    Car r9 = new SUV();
    
    //SUV r10 = new Motor(); // 오류!
    //SUV r11 = new Car(); // 오류!
    SUV r12 = new SUV();
  }
}

/* 레퍼런스에 저장할 수 있는 주소
 * => 해당 타입 및 서브 클래스의 인스턴스 주소를 저장할 수 있다.
 * => 그러나 수퍼 클래스의 인스턴스 주소는 저장할 수 없다.
 * 
 * "서브 객체는 가리킬 수 있어도 수퍼 객체는 가리킬 수 없다"
 * 
 * 일반 개념으로 이해해보자!
 * => 분류 개념으로 이해할 수 있다.
 * => 분류
 * 동물
 * => 포유류
 *    => 영장류
 *       => 원숭이
 *       => 사람
 *    => 개과
 * => 파충류
 *    => 뱀
 */









