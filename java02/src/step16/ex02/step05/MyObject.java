package step16.ex02.step05;

/* 애노테이션 선택 프로퍼티
 * => 선택 프로퍼티들은 값을 반드시 설정할 필요는 없다.
 *    값을 설정하지 않으면 애노테이션 정의할 때 선언된 기본 값을 사용한다.
 */
//@MyAnnotation // OK! 프로퍼티 값을 지정하지 않는다.
//@MyAnnotation(value="haha")  // OK! 선택 프로퍼티 중에서 설정하고픈 프로퍼티만 설정하면 된다.
//@MyAnnotation("haha") // OK! 물론 프로퍼티명이 없다면 그것은 value 프로퍼티를 가리키는 것이다.
//@MyAnnotation("haha",name="값...") // 오류! value 값만 설정할 때 프로퍼티 이름을 생략할 수 있다.
@MyAnnotation(value="haha",name="값...") // OK! 이렇게 모두 이름을 지정해야 한다.
public class MyObject {

}
