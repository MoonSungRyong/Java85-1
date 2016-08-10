package step16.ex02.step01;

/* 애노테이션 정의
 * => @interface 키워드를 사용하여 애노테이션을 정의한다.
 */
public @interface MyAnnotation {
  // 애노테이션의 프로퍼티 선언
  // => 메서드 처럼 선언한다.
  // => 파라미터를 가져서는 안된다.
  String value(); 
}
