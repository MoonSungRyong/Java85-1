// 주제: 바이너리 데이터 주고 받기 
package step14.ex02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {

  public static void main(String[] args) throws Exception {
    ServerSocket serverSocket = new ServerSocket(8888);
    Socket socket = serverSocket.accept();
    
    // 입출력 스트림 객체에 데코레이터를 바로 붙인다.
    DataInputStream in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
    PrintStream out = new PrintStream(socket.getOutputStream());
    
    int len = in.readInt(); // 파일 크기를 읽는다.
    String filename = in.readUTF(); // 파일명을 읽는다.

    //파일 출력 스트림 준비
    FileOutputStream fileOut = new FileOutputStream(filename); // 프로젝트 폴더로 출력한다.
    BufferedOutputStream fileOut2 = new BufferedOutputStream(fileOut);
    
    // 데이터를 읽는다.
    for (int i = 0; i < len; i++) {
      fileOut2.write(in.read());
    }
    
    fileOut2.flush();
    fileOut2.close();
    fileOut.close();
    
    in.close();
    out.close();
    socket.close();
    serverSocket.close();
  }

}
