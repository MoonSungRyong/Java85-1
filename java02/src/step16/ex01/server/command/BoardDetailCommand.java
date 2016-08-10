package step16.ex01.server.command;

import java.io.ObjectOutputStream;
import java.util.Map;

import step16.ex01.server.BoardDao;
import step16.ex01.server.Command;

public class BoardDetailCommand implements Command {
  BoardDao boardDao;
  
  public void setBoardDao(BoardDao boardDao) {
    this.boardDao = boardDao;
  }

  @Override
  public void service(ObjectOutputStream out, Map<String, String> paramMap) throws Exception {
    int no = Integer.parseInt(paramMap.get("no"));
    out.writeObject(boardDao.selectOne(no));
  }
}








