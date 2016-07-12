/* 주제: 인터페이스의 또 다른 이점
 * => 누가 그 규칙을 준수할 수 있다.
 * => 규칙을 따른 객체라면 언제든 그 자리에 사용할 수 있다.
 */

package step10.exam083;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalculator2 extends Frame implements ActionListener {
  TextField tf1 = new TextField();
  TextField tf2 = new TextField();
  Choice opChooser = new Choice();
  TextField tf3 = new TextField();
  
  public MyCalculator2() {
    super("계산기2");
    
    setLayout(new FlowLayout());
    tf1.setPreferredSize(new Dimension(50,30));
    tf2.setPreferredSize(new Dimension(50,30));
    
    opChooser.add("+");
    opChooser.add("-");
    opChooser.add("*");
    opChooser.add("/");
    Button computeBtn = new Button("계산");
    
    tf3.setPreferredSize(new Dimension(100,30));
    
    add(tf1);
    add(opChooser);
    add(tf2);
    add(computeBtn);
    add(tf3);
    
    setSize(640, 200);

    addWindowListener(new MyWindowListener());
    
    // MyCalculator2 객체 자신이 ActionListener를 구현한 객체이기 때문에
    // 다음과 같이 자신의 주소를 전달하면 된다.
    computeBtn.addActionListener(this);
  }
  
  public static void main(String[] args) {
    MyCalculator2 f = new MyCalculator2();
    f.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String op = opChooser.getSelectedItem();
    int a = Integer.parseInt(tf1.getText());
    int b = Integer.parseInt(tf2.getText());
    int result = 0;
    
    switch (op) {
    case "+": result = a + b; break;
    case "-": result = a - b; break;
    case "*": result = a * b; break;
    case "/": result = a / b; break;
    }
    
    tf3.setText(Integer.toString(result));
  }

}















