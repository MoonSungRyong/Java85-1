package step10.exam082;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// 윈도우 이벤트를 처리할 리스너 만들기
// 1) WindowListener 규칙을 직접 구현하기
// 2) WindowAdapter를 상속 받기
//
public class MyWindowListener implements WindowListener {

  @Override
  public void windowOpened(WindowEvent e) {
    System.out.println("windowOpened");
  }

  @Override
  public void windowClosing(WindowEvent e) {
    System.out.println("windowClosing");   
    System.exit(0);
  }

  @Override
  public void windowClosed(WindowEvent e) {
    System.out.println("windowClosed");    
  }

  @Override
  public void windowIconified(WindowEvent e) {
    System.out.println("windowIconified");    
  }

  @Override
  public void windowDeiconified(WindowEvent e) {
    System.out.println("windowDeiconified");    
  }

  @Override
  public void windowActivated(WindowEvent e) {
    System.out.println("windowActivated");    
  }

  @Override
  public void windowDeactivated(WindowEvent e) {
    System.out.println("windowDeactivated");    
  }

}







