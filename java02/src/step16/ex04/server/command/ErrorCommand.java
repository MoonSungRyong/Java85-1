package step16.ex04.server.command;

import java.io.ObjectOutputStream;
import java.util.Map;

import org.springframework.stereotype.Component;

import step16.ex04.server.Command;

@Component("error")
public class ErrorCommand implements Command {
  @Override
  public void service(ObjectOutputStream out, Map<String, String> paramMap) throws Exception {
    out.writeObject(new Exception("해당 명령을 지원하지 않습니다."));
  }
}








