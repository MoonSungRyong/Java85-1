package step16.ex02.step08;

import java.lang.annotation.Annotation;

public class Test01 {

  public static void main(String[] args) {
    Class<?> clazz = MyObject.class;
    
    // 클래스에 붙은 애노테이션 목록을 얻기
    // => 애노테이션 유지 정책이 RUMTIME일 경우 가능하다.
    // => SOURCE는 컴파일 단계에서 제거되고,
    // => CLASS는 .class 파일에 애노테이션 존재하지만 실행할 때 꺼낼 수 없다.
    // => 애노테이션을 정의할 때 애노테이션 유지 정책을 지정하지 않으면,
    //    기본 정책(CLASS)을 사용한다.
    // => 따라서 MyAnnotation의 유지 정책은 "CLASS"이기 때문에
    //    다음과 같이 실행할 때 꺼낼 수 없다.
    Annotation[] annoList = clazz.getAnnotations();
    
    for (Annotation anno : annoList) {
      // 애노테이션의 이름을 출력한다.
      System.out.println(anno.annotationType().getName());
    }

  }

}
