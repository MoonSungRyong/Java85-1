package designpatterns.proxy.server;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class CalcProxy implements Calc {
  String ip;
  int port;
  
  public CalcProxy(String ip, int port) {
    this.ip = ip;
    this.port = port;
  }
  
  private int send(int a, int b, String op) {
    Socket s = null;
    ObjectInputStream in = null;
    ObjectOutputStream out = null;
    int result;
    
    try {
      s = new Socket(ip, port);
      out = new ObjectOutputStream(s.getOutputStream());
      out.writeInt(a);
      out.writeInt(b);
      out.writeUTF(op);
      out.flush();
      
      in = new ObjectInputStream(s.getInputStream());
      result = in.readInt();
      return result;
      
    } catch (Exception e) {
      return 0;
      
    } finally {
      try{in.close();} catch (Exception e) {}
      try{out.close();} catch (Exception e) {}
      try{s.close();} catch (Exception e) {}
    }
  }
  
  @Override
  public int plus(int a, int b) {
    return send(a, b, "+");
  }

  @Override
  public int minus(int a, int b) {
    return send(a, b, "-");
  }

}
