package step16.ex01.server.command;

import java.io.ObjectOutputStream;
import java.util.Map;

import step16.ex01.server.Command;

public class HelloCommand implements Command {
  @Override
  public void service(ObjectOutputStream out, Map<String, String> paramMap) throws Exception {
    out.writeObject("안녕하세요.^^");
  }
}








