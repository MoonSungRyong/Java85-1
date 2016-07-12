package step11.ex01;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainApp extends Frame {
  public MainApp() {
    super("비트캠프 울트라 예제");
    
    //1) 윈도우의 닫기 버튼 이벤트를 처리할 리스너 등록
    addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
    
    //2) 윈도우 크기 지정
    setSize(500, 400);
  }
  
  public static void main(String[] args) {
    MainApp app = new MainApp();
    app.setVisible(true);
  }
  
}











