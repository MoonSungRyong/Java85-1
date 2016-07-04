/* 주제: StringBuffer 클래스 - 소개 
 * 버퍼(buffer)?
 * => 데이터를 보관하는 메모리 영역. 보통 배열로 만든다.
 * 캐쉬(cache)?
 * => 데이터가 백업되는 메모리 영역. 보통 하드 디스크의 임시 폴더.
 */
package step09;

public class Exam068_1 /*extends Object*/ {
  public static void main(String[] args) {
    StringBuffer buf1 = new StringBuffer("hello");
    
    // StringBuffer는 Mutable 객체이다.
    // => 데이터를 변경할 수 있다.
    // => 계속 문자열을 변경해야 하는 에디터를 만들 때 사용할 수 있다.
    buf1.append(", world!");
    
    
    System.out.println(buf1);
  }

}


/* String vs StringBuffer vs StringBuilder?
 * 1) Immutable vs Mutable 
 *    => String은 Immutable 객체로서 데이터를 변경할 수 없다.
 *    => StringBuffer와 StringBuilder는 Mutable 객체로서 데이터를 변경할 수 있다.
 * 2) Thread-safe 여부
 *    => StringBuffer는 thread-safe하다. 즉 여러 스레드가 동시에 접근하더라도,
 *       한 번에 한 스레드만이 데이터를 변경하도록 관리해준다.
 *    => StringBuilder는 thread-safe하지 않다. 즉 여러 스레드가 동시에 접근하여
 *       값을 바꿀 수 있다. 데이터가 일치하지 않는 문제가 발생한다.
 *       
 */










