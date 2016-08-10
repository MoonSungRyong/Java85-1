package step16.ex02.step06;

/* 애노테이션 배열 프로퍼티
 * => 배열 프로퍼티는 중괄호{}를 사용하여 값을 설정한다.
 * => 값을 한 개만 설정할 때는 중괄호{}를 생략할 수 있다.
 */
//@MyAnnotation(value={"값1", "값2", "값3"}) // 여러 개 값 설정
//@MyAnnotation(value={"값1"}) // 한 개 값 설정
//@MyAnnotation(value="값1") // 배열 프로퍼티에 값을 한 개만 지정할 때는 중괄호{} 생략 가능!
@MyAnnotation("값1") // 배열 프로퍼티 이름이 value 이고, value 값만 지정할 때는 프로퍼티명 생략 가능!
public class MyObject {

}
