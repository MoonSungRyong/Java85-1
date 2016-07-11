package step10.exam082;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

// 문법 => 상속 - specialization
public class MyCalculator extends Frame {
  
  public MyCalculator() {
    super("계산기");
    
    // 레이아웃 매니저 교체: BorderLayout ---> FlowLayout
    setLayout(new FlowLayout());
    
    TextField tf1 = new TextField();
    tf1.setPreferredSize(new Dimension(50,30));
    TextField tf2 = new TextField();
    tf2.setPreferredSize(new Dimension(50,30));
    Choice opChooser = new Choice();
    opChooser.add("+");
    opChooser.add("-");
    opChooser.add("*");
    opChooser.add("/");
    Button computeBtn = new Button("계산");
    TextField tf3 = new TextField();
    tf3.setPreferredSize(new Dimension(100,30));
    
    add(tf1);
    add(opChooser);
    add(tf2);
    add(computeBtn);
    add(tf3);
    
    setSize(640, 200);
    addWindowListener(new MyWindowListener());
    //computeBtn.addActionListener(new ComputeBtnListener(opChooser, tf1, tf2, tf3));
    ComputeBtnListener listener = new ComputeBtnListener();
    listener.opChooser = opChooser;
    listener.tf1 = tf1;
    listener.tf2 = tf2;
    listener.tf3 = tf3;
    computeBtn.addActionListener(listener);
  }
  
  public static void main(String[] args) {
    MyCalculator f = new MyCalculator();
    f.setVisible(true);
  }

}

/* FlowLayout 배치 관리자
 * => 자식 윈도우의 preferred size를 계산하여 배치를 수행한다.
 * => 버튼인 경우 preferred size는 버튼의 제목으로 자동 계산된다.
 *    즉 제목이 길면 버튼의 너비도 길어진다.
 * => Choice는 출력되는 콘텐츠에 따라 길이가 자동 결정된다.
 * => TextField는 내부에 설정된 preferred size를 사용하여 배치한다.
 *    그래서 TextField에 preferred size를 지정하지 않으면 최소 크기로 배치된다.
 *    
 * 
 */













