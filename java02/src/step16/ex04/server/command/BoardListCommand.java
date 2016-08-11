package step16.ex04.server.command;

import java.io.ObjectOutputStream;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import step16.ex04.server.BoardDao;
import step16.ex04.server.Command;

@Component("/board/list.do")
public class BoardListCommand implements Command {
  @Autowired BoardDao boardDao;
  
  @Override
  public void service(ObjectOutputStream out, Map<String, String> paramMap) throws Exception {
    int pageNo = 1;
    int length = 5;
    
    if (paramMap.get("pageNo") != null) {
      pageNo = Integer.parseInt(paramMap.get("pageNo"));
    }
    
    if (paramMap.get("length") != null) {
      length = Integer.parseInt(paramMap.get("length"));
    }
    out.writeObject(boardDao.selectList(pageNo, length));
  }
}








