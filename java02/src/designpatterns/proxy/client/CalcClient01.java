//1단계: 프록시 패턴 적용 전
package designpatterns.proxy.client;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class CalcClient01 {

  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);
    
    int a, b, result;
    String op;
    
    while (true) {
      try (
        Socket s = new Socket("localhost", 8888);
        ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
      ) {
        System.out.println("명령어를 입력하세요. 예) 12 - 34\n명령어> ");
        a = keyScan.nextInt();
        op = keyScan.next();
        b = keyScan.nextInt();
        
        out.writeInt(a);
        out.writeInt(b);
        out.writeUTF(op);
        out.flush();
        
        ObjectInputStream in = new ObjectInputStream(s.getInputStream());
        result = in.readInt();
        System.out.printf("%d %s %d = %d\n", a, op, b, result);
        try {in.close();} catch (Exception e) {}
        
      } catch (Exception e) {}
    }
    
    //keyScan.close();
  }

}
