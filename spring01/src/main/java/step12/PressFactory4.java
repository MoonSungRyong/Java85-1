package step12;

import org.springframework.beans.factory.FactoryBean;

// 공장 클래스를 만들 때 스프링의 규칙에 따라 만든다면,
// 설정할 때 무지 편하다!
public class PressFactory4 implements FactoryBean<Press> {
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








