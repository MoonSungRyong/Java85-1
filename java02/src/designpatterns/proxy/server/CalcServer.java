package designpatterns.proxy.server;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalcServer {
  public static void main(String[] args) throws Exception {
    ServerSocket ss = new ServerSocket(8888);
    System.out.println("서버 실행 중...");
    
    Socket s;
    int a, b, result;
    String op;
    ObjectInputStream in = null;
    ObjectOutputStream out = null;
    
    while (true) {
      s = ss.accept();
      try {
        in = new ObjectInputStream(s.getInputStream());
        a = in.readInt();
        b = in.readInt();
        op = in.readUTF();
        
        switch (op) {
        case "+": result = a + b; break;
        case "-": result = a - b; break;
        default:
          result = 0;
        }
  
        out = new ObjectOutputStream(s.getOutputStream());
        out.writeInt(result);
        out.flush();
        
      } catch (Exception e) {
      } finally {
        try {in.close();} catch (Exception e) {}
        try {out.close();} catch (Exception e) {}
        try {s.close();} catch (Exception e) {}
      }
      
    }
  }
}









