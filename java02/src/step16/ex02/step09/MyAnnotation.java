package step16.ex02.step09;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* 애노테이션 유지 정책 지정
 * => RetentionPolicy.SOURCE
 *    컴파일할 때 제거됨. *.class 파일에 보관되지 않음.
 * => RetentionPolicy.CLASS
 *    컴파일한 후 *.class 파일에 보관됨. 단 실행 중에 꺼낼 수 없음.
 * => RetentionPolicy.RUNTIME
 *    컴파일한 후 *.class 파일에 보관됨. 실행 중에 꺼낼 수 있음.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
  String name();
  int age();
}
