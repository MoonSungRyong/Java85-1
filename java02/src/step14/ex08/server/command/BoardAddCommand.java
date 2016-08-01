package step14.ex08.server.command;

import java.io.ObjectOutputStream;
import java.util.Map;

import step14.ex08.server.BoardDao;
import step14.ex08.server.Command;
import step14.ex08.vo.Board;

public class BoardAddCommand implements Command {
  BoardDao boardDao;
  
  public void setBoardDao(BoardDao boardDao) {
    this.boardDao = boardDao;
  }

  @Override
  public void service(ObjectOutputStream out, Map<String, String> paramMap) throws Exception {
    Board board = new Board();
    board.setPassword(paramMap.get("password"));
    board.setTitle(paramMap.get("title"));
    board.setContents(paramMap.get("contents"));
    
    out.writeObject(boardDao.insert(board));
  }
}








