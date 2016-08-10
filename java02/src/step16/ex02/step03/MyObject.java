package step16.ex02.step03;

/* 애노테이션 사용
 * => 프로퍼티 명이 "value"가 아니면 프로퍼티명을 생략할 수 없다. 
 */
//@MyAnnotation("값...") // 컴파일 오류!
@MyAnnotation(name="값...")
public class MyObject {

}
