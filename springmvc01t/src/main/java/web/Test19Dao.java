/* 주제: AOP 테스트용 DAO
 */
package web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository   
public class Test19Dao {
  
  public List<Member> selectList() {
    System.out.println("Test19Dao.selectList()");
    return new ArrayList<>();
  }
  
  public int insert() {
    System.out.println("Test19Dao.insert()");
    return 1;
  }
  
  public int update() {
    System.out.println("Test19Dao.update()");
    return 1;
  }
  
  public int delete() {
    System.out.println("Test19Dao.delete()");
    return 1;
  }
  
  public Member selectOne() {
    System.out.println("Test19Dao.selectOne()");
    return new Member();
  }
}










