package step16.ex02.step04;

/* 애노테이션 필수 프로퍼티
 * => 필수 프로퍼티들은 반드시 값을 설정해야 한다.
 */
//@MyAnnotation(value="값...") // name 프로퍼티를 설정 안해서 오류!
//@MyAnnotation(name="값...") // value 프로퍼티를 설정 안해서 오류!
//@MyAnnotation(value="값1", name="값2") // OK! 필수 프로퍼티 모두 값을 설정해야 된다.
@MyAnnotation(name="값2",value="값1") // OK! 프로퍼티 순서는 상관없다.
public class MyObject {

}
