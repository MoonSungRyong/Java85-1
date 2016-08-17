package step12;

import org.springframework.beans.factory.FactoryBean;

// 스프링에서 제공하는 FactoryBean 인터페이스를 구현할 때는
// 다른 개발자가 알아채기 쉽도록 클래스 이름 뒤에 "FactoryBean"을 붙인다.
public class PressFactoryBean implements FactoryBean<Press> {
  // 객체를 생성할 때 사용할 값은 프로퍼티로 받아야 한다.
  String name;
  String tel;

  // 값을 받기만 하므로 셋터 메서드만 준비하라!
  public void setName(String name) {
    this.name = name;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  @Override
  public Press getObject() throws Exception {
    Press p = new Press(name, tel);
    return p;
  }

  @Override
  public Class<?> getObjectType() {
    return Press.class;
  }

  @Override
  public boolean isSingleton() {
    return true;
  }
}








