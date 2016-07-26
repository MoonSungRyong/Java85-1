package step14.ex02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.Socket;
import java.util.Scanner;

public class FileClient {

  public static void main(String[] args) throws Exception {
    Socket socket = new Socket("192.168.0.53", 8888);
    System.out.println("서버와 연결되었다.");
    
    Scanner in = new Scanner(socket.getInputStream());
    DataOutputStream out = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
    
    File file = new File("test.jpg");
    FileInputStream fileIn = new FileInputStream(file);
    BufferedInputStream fileIn2 = new BufferedInputStream(fileIn);
    
    int len = (int)file.length();
    out.writeInt(len);
    System.out.println("파일 크기 보냈다.");
    
    out.writeUTF("설현.jpg");
    System.out.println("파일명 보냈다.");
    
    for (int i = 0; i < len; i++) {
      out.write(fileIn2.read());
    }
    out.flush();
    System.out.println("파일 전송 완료!");
    
    fileIn2.close();
    fileIn.close();
    in.close();
    out.close();
    socket.close();
  }

}
