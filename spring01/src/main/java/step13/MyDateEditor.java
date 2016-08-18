package step13;

import java.beans.PropertyEditorSupport;
import java.text.SimpleDateFormat;
import java.util.Date;

/* String을 특정 객체로 변환시키는 클래스를 프로퍼티 에디터라 부른다.
 * => 만드는 방법: java.beans.PropertyEditor 규칙(인터페이스)에 따라 만들어야 한다.
 * => 그러나 너무 많은 메서드를 구현해야 하기 때문에 직접 구현하기가 번거롭다.
 * => 그래서 자바는 개발자가 좀 더 쉽게 프로퍼티 에디터를 만들 수 있도록
 *    미리 PropertyEditor를 구현한 클래스를 만들어 제공하고 있다.
 *    그 클래스 이름이 "PropertyEditorSupport"이다.
 * => 따라서 PropertyEditor 구현체를 직접 만들기 보다는,
 *    자바에서 제공해주는 도우미 클래스를 상속 받아서 만드는 것이 좋다. 
 */

public class MyDateEditor extends PropertyEditorSupport {
  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
  
  @Override
  public void setAsText(String text) throws IllegalArgumentException {
    // 이 메서드는 문자열을 입력 받았을 때 변환하기 위해 스프링 IoC 컨테이너가 호출할 것이다.
    try {
      this.setValue(dateFormat.parse(text));
      
    } catch (Exception e) {
      throw new IllegalArgumentException(e);
    }
  }
}








