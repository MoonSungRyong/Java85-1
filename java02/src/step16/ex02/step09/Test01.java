package step16.ex02.step09;

import java.lang.annotation.Annotation;

public class Test01 {

  public static void main(String[] args) {
    Class<?> clazz = MyObject.class;
    
    // 애노테이션 유지 정책이 RUMTIME일 경우, 실행할 때 꺼낼 수 있다.
    Annotation[] annoList = clazz.getAnnotations();
    
    for (Annotation anno : annoList) {
      // 애노테이션의 이름을 출력한다.
      System.out.println(anno.annotationType().getName());
    }

  }

}
