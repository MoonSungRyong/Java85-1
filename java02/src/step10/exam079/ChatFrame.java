package step10.exam079;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;

public class ChatFrame extends Frame {
  public ChatFrame() {
    super("Chatting Application");
    
    TextArea ta = new TextArea();
    // TextArea의 너비와 높이는 설정할 필요가 없다.
    // 이유? BorderLayout이 해당 영역에 자식 윈도우를 꽉 채우기 때문이다.
    add(ta, BorderLayout.CENTER);
    
    MessageInputBox inputBox = new MessageInputBox();
    add(inputBox, BorderLayout.SOUTH);
    
    setSize(300, 500);
  }
}







