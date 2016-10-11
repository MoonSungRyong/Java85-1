/* 주제: AOP 테스트용 페이지 컨트롤러
 */
package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller   
public class Test19 {
  @Autowired
  Test19Dao dao;
  
  @RequestMapping(value="/test19/selectList", produces=MediaType.ALL_VALUE)
  @ResponseBody
  public String selectList() {
    System.out.println("Test19.selectList()");
    dao.selectList();
    return "selectList";
  }
  
  @RequestMapping(value="/test19/selectOne", produces=MediaType.ALL_VALUE)
  @ResponseBody
  public String selectOne() {
    System.out.println("Test19.selectOne()");
    dao.selectOne();
    return "selectOne";
  }
  
  @RequestMapping(value="/test19/insert", produces=MediaType.ALL_VALUE)
  @ResponseBody
  public String insert() {
    System.out.println("Test19.insert()");
    dao.insert();
    return "insert";
  }
  
  @RequestMapping(value="/test19/update", produces=MediaType.ALL_VALUE)
  @ResponseBody
  public String update() {
    System.out.println("Test19.update()");
    dao.update();
    return "update";
  }
  
  @RequestMapping(value="/test19/delete", produces=MediaType.ALL_VALUE)
  @ResponseBody
  public String delete() {
    System.out.println("Test19.delete()");
    dao.delete();
    return "delete";
  }
}










