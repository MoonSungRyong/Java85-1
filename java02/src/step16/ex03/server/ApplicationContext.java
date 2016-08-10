// 주제: properties 파일 대신 애노테이션을 사용하여 객체 생성 및 관리
package step16.ex03.server;

import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class ApplicationContext {
  String binDirPath;
  
  HashMap<String,Object> beanContainer = new HashMap<>();
  
  public ApplicationContext(String packageName) throws Exception {
    binDirPath = new File("bin").getCanonicalPath();
    //System.out.println(binDirPath);
    
    //1) packageName에 해당하는 폴더를 뒤져서 .class 파일을 찾아낸다.
    //   => 패키지 이름을 파일 경로로 바꾼다.
    //      예) step16.test ---> step15/test
    String filePath = "bin/" + packageName.replace('.', '/');
    
    //2) 인스턴스를 생성한다.
    createObject(new File(filePath)); // 현재 프로젝트 폴더를 기준으로 경로가 지정될 것이다.
    
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

  private void createObject(File dir) throws Exception {
    File[] files = dir.listFiles();
    
    String className;
    Class<?> clazz;
    Object instance;
    Component compAnno;
    
    for (File f : files) {
      if (f.isFile() && f.getName().endsWith(".class") && !f.getName().contains("$")) {
        // 파일 이름에서 패키지 폴더 이름만 남겨두고 앞에 붙은 경로는 제거한다.
        // 예) /Users/eomjinyoung/git/Java85/java02/bin/step16/ex03/server/BoardDaoImpl.class
        //     => step16/ex03/server/BoardDaoImpl.class
        className = f.getCanonicalPath()
                    .substring(binDirPath.length() + 1)
                    .replace(".class", "")
                    .replace("/", ".")
                    .replace("\\", ".");
        //System.out.println(className);
        
        clazz = Class.forName(className.trim());
        compAnno = clazz.getAnnotation(Component.class);
        if (compAnno == null)
          continue;
        
        //@Component 애노테이션이 붙었으면 인스턴스를 생성한다.
        instance = clazz.newInstance();
        System.out.println(clazz.getName());
        
        if (FactoryBean.class.isInstance(instance)) {
          beanContainer.put(compAnno.value(), ((FactoryBean)instance).getObject());
        } else {
          beanContainer.put(compAnno.value(), instance);
        }
      } else if (f.isDirectory()) {
        createObject(f);
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














