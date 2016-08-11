package step16.ex04.server.command;

import java.io.ObjectOutputStream;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import step16.ex04.server.BoardDao;
import step16.ex04.server.Command;
import step16.ex04.vo.Board;

@Component("/board/update.do")
public class BoardUpdateCommand implements Command {
  @Autowired BoardDao boardDao;

  @Override
  public void service(ObjectOutputStream out, Map<String, String> paramMap) throws Exception {
    Board board = new Board();
    board.setNo(Integer.parseInt(paramMap.get("no")));
    board.setTitle(paramMap.get("title"));
    board.setContents(paramMap.get("contents"));
    
    out.writeObject(boardDao.update(board));
  }
}








