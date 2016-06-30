/* 주제: 다형성(polymorphism) - 다형적 변수
 */
package step08.ex06;

public class Exam063_1 {
  public static void main(String[] args) {
    Motor r1 = new Motor();
    // r1 레퍼런스는 Motor 타입니다.
    // 즉 Motor에 있는 도구만 사용할 수 있다. 
    // 물론, Motor의 수퍼 클래스 도구도 내 것 마냥 사용할 수 있다.
    r1.cc = 100;
    r1.maker = "비트자동차";
    //r1.capacity = 4;// 컴파일 오류! Motor타입에 선언된 변수가 아니라서 사용할 수 없다.
    
  }
}










