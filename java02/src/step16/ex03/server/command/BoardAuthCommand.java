package step16.ex03.server.command;

import java.io.ObjectOutputStream;
import java.util.Map;

import step16.ex03.server.BoardDao;
import step16.ex03.server.Command;
import step16.ex03.server.Component;

@Component("/board/auth.do")
public class BoardAuthCommand implements Command {
  BoardDao boardDao;
  
  public void setBoardDao(BoardDao boardDao) {
    this.boardDao = boardDao;
  }

  @Override
  public void service(ObjectOutputStream out, Map<String, String> paramMap) throws Exception {
    int no = Integer.parseInt(paramMap.get("no"));
    String password = paramMap.get("password");
    out.writeObject(boardDao.selectOne(no, password));
  }
}








