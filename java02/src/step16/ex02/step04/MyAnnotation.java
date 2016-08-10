package step16.ex02.step04;

/* 애노테이션 정의
 * => @interface 키워드를 사용하여 애노테이션을 정의한다.
 */
public @interface MyAnnotation {
  String value();
  String name(); 
}
