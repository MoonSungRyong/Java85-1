package step10;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {
  
  public MyFrame() {
    super("내 첫 윈도우!");
    this.setSize(300, 200);
    this.addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }
  
  public static void main(String[] args) {
    MyFrame window = new MyFrame();
    window.setVisible(true);
  }

}
