package server.command;

import java.io.ObjectOutputStream;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import server.BoardDao;
import server.Command;

@Component("/board/auth.do")
public class BoardAuthCommand implements Command {
  @Autowired BoardDao boardDao;
  
  @Override
  public void service(ObjectOutputStream out, Map<String, String> paramMap) throws Exception {
    int no = Integer.parseInt(paramMap.get("no"));
    String password = paramMap.get("password");
    out.writeObject(boardDao.selectOne(no, password));
  }
}








