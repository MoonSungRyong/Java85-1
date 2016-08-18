//2단계: 명령어가 추가될 때 마다 그 명령어를 처리하는 메서드와 조건문을   
//       추가해야 하는 문제 해결
//       => 명령어를 처리하는 메서드를 객체화 시킨다.
//       => 즉 명령어를 처리하는 메서드를 클래스로 단위로 포장한다.
//       => 이점? 명령어를 추가할 때 마다 기존 코드의 변경을 최소화한다.
//       => "Command" 패턴
//
package server;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;

class RequestHandler extends Thread {
  Socket socket;
  ApplicationContext applicationContext;
  
  public void setSocket(Socket socket) {
    this.socket = socket;
  }

  public void setApplicationContext(ApplicationContext applicationContext) {
    this.applicationContext = applicationContext;
  }

  @Override
  public void run() {
    try (
      ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
      ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
    ) {
      Map<String,String> paramMap = parseCommand(in.readUTF());
      Command command = (Command)applicationContext.getBean(paramMap.get("path"));
      
      if (command != null) {
        command.service(out, paramMap);
        
      } else {
        ((Command)applicationContext.getBean("error")).service(out, paramMap);
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






