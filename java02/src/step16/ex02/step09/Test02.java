package step16.ex02.step09;

public class Test02 {

  public static void main(String[] args) {
    Class<?> clazz = MyObject.class;
    
    // 클래스의 특정 애노테이션만 꺼내기
    // => 애노테이션의 타입을 알려주면, 그 애노테이션의 값을 보관하고 있는 객체를 리턴한다.
    MyAnnotation anno = clazz.getAnnotation(MyAnnotation.class);
    
    // 객체에 보관된 애노테이션 프로퍼티 값 꺼내기
    // => 메서드 호출하는 방법으로 꺼낸다.
    System.out.println(anno.name());
    System.out.println(anno.age());
    

  }

}
