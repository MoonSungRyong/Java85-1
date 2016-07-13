package step11.ex04;

import java.awt.Label;
import java.awt.Panel;

public class BoardPanel extends Panel {
  public BoardPanel() {
    Label label = new Label("게시판 화면");
    
    // Panel의 기본 레이아웃 관리자는 "FlowLayout" 이다.
    add(label);
  }
}
