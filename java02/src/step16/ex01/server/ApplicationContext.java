package step16.ex01.server;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.apache.ibatis.io.Resources;

public class ApplicationContext {
  
  HashMap<String,Object> beanContainer = new HashMap<>();
  
  public ApplicationContext(String configPath) throws Exception {
    //1) configPath 설정 파일의 정보를 읽어 들인다.
    Properties props = new Properties();
    props.load(Resources.getResourceAsStream(configPath));
    
    //2) 인스턴스를 생성한다.
    createObject(props);
    
    //3) 인스턴스의 의존 객체를 주입한다.
    injectDependencies();
  }
  
  private void injectDependencies() throws Exception {
    //1) 빈 컨테이너에 저장된 전체 객체 목록을 알아낸다.
    Collection<Object> objList = beanContainer.values();
    
    Class<?> clazz;
    Method[] methodList;
    Parameter[] paramList;
    Object dependency;
    
    for (Object obj : objList) {
      //2) 클래스 정보를 꺼낸다.
      clazz = obj.getClass();
      
      //3) 메서드 정보를 꺼낸다.
      methodList = clazz.getMethods();
      
      for (Method m : methodList) {
        //4) 셋터 메서드만 걸러낸다.
        if (!m.getName().startsWith("set"))
          continue;
        
        //5) 셋터 메서드 중에서 파라미터를 한 개만 원하는 메서드를 걸러낸다.
        paramList = m.getParameters();
        if (paramList.length != 1)
          continue;
        
        //6) 셋터 메서드가 원하는 값을 파라미터 타입으로 빈 컨테이너에서 찾는다.
        dependency = findDependency(paramList[0].getType());
        
        //7) 셋터 메서드가 원하는 의존 객체를 찾았는지 걸러낸다.
        if (dependency == null)
          continue;
        
        //8) 셋터 메서드를 호출하여 의존 객체를 주입한다.
        m.invoke(obj, dependency);
      }
    }
  }

  private Object findDependency(Class<?> type) {
    //1) 빈 컨테이너에서 모든 객체를 꺼낸다.
    Collection<Object> objList = beanContainer.values();
    
    for (Object obj : objList) {
      //2) 의존 객체의 타입과 일치하는 객체를 찾았으면 그 객체를 리턴한다.
      if (type.isInstance(obj))
        return obj;
    }
    
    return null;
  }

  private void createObject(Properties props) throws Exception {
    Set<Object> keyList = props.keySet();
    
    String className;
    Class<?> clazz;
    Object instance;
    
    for (Object key : keyList) {
      className = (String)props.get(key);
      clazz = Class.forName(className.trim());
      instance = clazz.newInstance();
      
      // FactoryBean 구현체인 경우, 
      // 그 구현체를 직접 저장하기 보다는
      // 그 구현체가 생성한 객체를 사용해야 한다.
      if (FactoryBean.class.isInstance(instance)) {
        beanContainer.put((String)key, ((FactoryBean)instance).getObject());
      } else {
        beanContainer.put((String)key, instance);
      }
    }
  }

  public void addBean(String key, Object instance) {
    beanContainer.put(key, instance);
  }
  
  public Object getBean(String key) {
    return beanContainer.get(key);
  }
  
  public void print() {
    Set<Entry<String,Object>> entrySet = beanContainer.entrySet();
    for (Entry<String,Object> entry : entrySet) {
      System.out.printf("%s=%s\n", entry.getKey(), entry.getValue().getClass().getName());
    }
  }
}














