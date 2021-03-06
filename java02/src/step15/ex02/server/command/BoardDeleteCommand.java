package step15.ex02.server.command;

import java.io.ObjectOutputStream;
import java.util.Map;

import step15.ex02.server.BoardDao;
import step15.ex02.server.Command;

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








