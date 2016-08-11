package step16.ex04.server.command;

import java.io.ObjectOutputStream;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import step16.ex04.server.BoardDao;
import step16.ex04.server.Command;

@Component("/board/delete.do")
public class BoardDeleteCommand implements Command {
  @Autowired BoardDao boardDao;
  
  @Override
  public void service(ObjectOutputStream out, Map<String, String> paramMap) throws Exception {
    int no = Integer.parseInt(paramMap.get("no"));
    out.writeObject(boardDao.delete(no));
  }
}








