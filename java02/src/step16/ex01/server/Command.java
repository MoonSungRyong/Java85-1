// 인터페이스? 호출자와 피호출자 사이에 호출 규칙
// Command 인터페이스?
// => 호출자  : RequestHandler
// => 피호출자: 명령을 처리하는 클래스 
//
package step16.ex01.server;

import java.io.ObjectOutputStream;
import java.util.Map;

public interface Command {
  void service(ObjectOutputStream out, Map<String, String> paramMap) throws Exception;
}
