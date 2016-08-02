package step14.ex08.server;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ServerApp {
  BoardDaoImpl boardDao;
  Map<String,Command> commandMap;
  
  public ServerApp() throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/java85db", "java85", "1111"); 
    
    boardDao = new BoardDaoImpl();
    boardDao.setConnection(con); 
    
    commandMap = new HashMap<>();
    
    //1) command-map.properties 파일 읽기 
    Properties props = new Properties();
    props.load(new FileInputStream("command-map.properties"));
    
    //2) 프로퍼티 파일에서 읽은 클래스 이름으로 객체를 생성한 후 commandMap에 저장한다.
    Set<Object> keySet = props.keySet();
    String className;
    Class<?> clazz;
    Object obj;
    Method[] methods;
    Class[] paramTypes;
    
    for (Object key : keySet) {
      className = ((String)props.get(key)).trim();
      clazz = Class.forName(className);
      obj = clazz.newInstance();
      commandMap.put((String)key, (Command)obj);
      
      //Dao를 주입한다.
      //=> 셋터 메서드를 찾아서 호출한다.
      try {
        methods = clazz.getMethods();
        for (Method m : methods) {
          if (!m.getName().startsWith("set"))
            continue;
          
          paramTypes = m.getParameterTypes();
          if (paramTypes.length != 1)
            continue;
          
          if (paramTypes[0] == BoardDao.class) {
            m.invoke(obj, boardDao);
          } /*else if (paramTypes[0] == ProjectDao.class) {
            m.invoke(obj, projectDao);
          } else if (paramTypes[0] == MemberDao.class) {
            m.invoke(obj, memberDao);
          } else if (paramTypes[0] == ContactDao.class) {
            m.invoke(obj, contactDao);
          }*/
        }
      } catch (Exception e) {} // 메서드를 못 찾으면 예외 발생! ==> 무시한다.
    }
    
    
  }
  
  private void execute() throws Exception {
    ServerSocket serverSocket = new ServerSocket(8888);
    System.out.println("서버 실행 중...");
    
    Socket socket;
    RequestHandler handler;
    
    while (true) {
      socket = serverSocket.accept();

      handler = new RequestHandler();
      handler.setSocket(socket); // 클라이언트와 통신할 소켓을 주입하고,
      handler.setCommandMap(commandMap); // 명령어 처리 객체가 들어있는 맵을 전달한다.
      handler.start();
    }
    
  }
  
  public static void main(String[] args) {
    try {
      ServerApp server = new ServerApp();
      server.execute();
      
    } catch (Exception e) {
      System.out.println("서버 실행 중에 오류 발생!");
      e.printStackTrace();
    }
  }

}
  
  
  
  
  
  
  
  
