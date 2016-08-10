package step16.ex02.step05;

/* 선택 프로퍼티 선언하기
 */
public @interface MyAnnotation {
  // 생긴 것은 interface 처럼 생겼지만, 막상 문법을 보면
  // 사용법이 확실히 다르다.
  String value() default "기본 값";
  String name() default "기본 값"; 
}
