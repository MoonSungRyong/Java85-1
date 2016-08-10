package step16.ex03.server.command;

import java.io.ObjectOutputStream;
import java.util.Map;

import step16.ex03.server.BoardDao;
import step16.ex03.server.Command;
import step16.ex03.server.Component;
import step16.ex03.vo.Board;

@Component("/board/update.do")
public class BoardUpdateCommand implements Command {
  BoardDao boardDao;
  
  public void setBoardDao(BoardDao boardDao) {
    this.boardDao = boardDao;
  }

  @Override
  public void service(ObjectOutputStream out, Map<String, String> paramMap) throws Exception {
    Board board = new Board();
    board.setNo(Integer.parseInt(paramMap.get("no")));
    board.setTitle(paramMap.get("title"));
    board.setContents(paramMap.get("contents"));
    
    out.writeObject(boardDao.update(board));
  }
}








