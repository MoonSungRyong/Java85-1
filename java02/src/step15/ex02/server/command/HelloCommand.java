package step15.ex02.server.command;

import java.io.ObjectOutputStream;
import java.util.Map;

import step15.ex02.server.Command;

public class HelloCommand implements Command {
  @Override
  public void service(ObjectOutputStream out, Map<String, String> paramMap) throws Exception {
    out.writeObject("안녕하세요.^^");
  }
}








