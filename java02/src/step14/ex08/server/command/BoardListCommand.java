package step14.ex08.server.command;

import java.io.ObjectOutputStream;
import java.util.Map;

import step14.ex08.server.BoardDao;
import step14.ex08.server.Command;

public class BoardListCommand implements Command {
  BoardDao boardDao;
  
  public void setBoardDao(BoardDao boardDao) {
    this.boardDao = boardDao;
  }

  @Override
  public void service(ObjectOutputStream out, Map<String, String> paramMap) throws Exception {
    out.writeObject(boardDao.selectList());
  }
}








