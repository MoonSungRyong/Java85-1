package step14.ex07.server.command;

import java.io.ObjectOutputStream;
import java.util.Map;

import step14.ex07.server.BoardDao;
import step14.ex07.server.Command;

public class BoardDeleteCommand implements Command {
  BoardDao boardDao;
  
  public void setBoardDao(BoardDao boardDao) {
    this.boardDao = boardDao;
  }

  @Override
  public void service(ObjectOutputStream out, Map<String, String> paramMap) throws Exception {
    int no = Integer.parseInt(paramMap.get("no"));
    out.writeObject(boardDao.delete(no));
  }
}








