package step14.ex06.server;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

import step14.ex06.vo.Board;

class RequestHandler extends Thread {
  BoardDaoImpl boardDao;
  Socket socket;
  
  public void setBoardDao(BoardDaoImpl boardDao) {
    this.boardDao = boardDao;
  }
  
  public void setSocket(Socket socket) {
    this.socket = socket;
  }

  @Override
  public void run() {
    try (
      ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
      ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
    ) {
      String command = in.readUTF();
      
      Map<String,String> paramMap = parseCommand(command);
      
      if (paramMap.get("path").equals("/board/list.do")) {
        out.writeObject(boardDao.selectList());
        
      } else if (paramMap.get("path").equals("/board/detail.do")) {
        int no = Integer.parseInt(paramMap.get("no"));
        out.writeObject(boardDao.selectOne(no));
        
      } else if (paramMap.get("path").equals("/board/auth.do")) {
        int no = Integer.parseInt(paramMap.get("no"));
        String password = paramMap.get("password");
        out.writeObject(boardDao.selectOne(no, password));
      
      } else if (paramMap.get("path").equals("/board/delete.do")) {
        int no = Integer.parseInt(paramMap.get("no"));
        out.writeObject(boardDao.delete(no));
        
      } else if (paramMap.get("path").equals("/board/update.do")) {
        Board board = new Board();
        board.setNo(Integer.parseInt(paramMap.get("no")));
        board.setTitle(paramMap.get("title"));
        board.setContents(paramMap.get("contents"));
        
        out.writeObject(boardDao.update(board));
      
      } else if (paramMap.get("path").equals("/board/add.do")) {
        Board board = new Board();
        board.setPassword(paramMap.get("password"));
        board.setTitle(paramMap.get("title"));
        board.setContents(paramMap.get("contents"));
        
        out.writeObject(boardDao.insert(board));
      
      } else {
        out.writeObject(new Exception("해당 명령을 지원하지 않습니다."));
      }
      out.flush(); // 소켓 내부의 버퍼에 출력된 값을 클라이언트로 방출한다.
      
    } catch (Exception e) {
      System.out.println("클라이언트 요청을 처리하는 중에 오류 발생!");
      e.printStackTrace();
      
    } finally {
      try {socket.close();} catch (Exception e) {}
    }
  }

  private Map<String, String> parseCommand(String command) {
    HashMap<String,String> map = new HashMap<>();
    
    String[] arr = command.split("\\?");
    map.put("path", arr[0]);
    
    String[] params;
    if (arr.length > 1) {
      params = arr[1].split("&");
      String[] values;
      for (String param : params) {
        values = param.split("=");
        map.put(values[0], values[1]);
      }
    }
    
    return map;
  }
  
}

/* URL 파싱하기
 * 예) search.naver.com/search.naver?where=nexearch&query=홍길동&sm=top_hty&fbm=1&ie=utf8
 * split("?") =>
 *   ["search.naver.com/search.naver", "where=nexearch&query=홍길동&sm=top_hty&fbm=1&ie=utf8"]
 * 
 * split("&") =>
 *   ["where=nexearch", "query=홍길동", "sm=top_hty", "fbm=1", "ie=utf8"]
 *   
 * split("=")
 *   where --> "nexearch"
 *   query --> "홍길동"
 *   sm    --> "top_hty"
 *   fbm   --> "1"
 *   ie    --> "utf8"
 */







