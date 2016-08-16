package server;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component("sqlSessionFactory")
public class SqlSessionFactoryFactoryBean implements FactoryBean {

  @Override
  public Object getObject() throws Exception {
    return new SqlSessionFactoryBuilder().build(
        Resources.getResourceAsStream("server/mybatis-config.xml"));
  }

  @Override
  public Class getObjectType() {
    return SqlSessionFactory.class;
  }

  @Override
  public boolean isSingleton() {
    return true;
  }

}
