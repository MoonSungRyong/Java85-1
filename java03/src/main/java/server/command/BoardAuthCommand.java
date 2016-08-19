package server.command;

import java.io.ObjectOutputStream;
import java.util.HashMap;
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
    HashMap<String,Object> map = new HashMap<>();
    map.put("no", Integer.parseInt(paramMap.get("no")));
    map.put("password", paramMap.get("password"));
    
    out.writeObject(boardDao.selectOneByPassword(map));
  }
}








