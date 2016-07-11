/* 주제: inner class 사용 후
 * inner class(중첩 클래스)
 * => 클래스 안에 정의한 클래스
 * => 중첩 클래스는 오직 해당 클래스에서만 사용할 목적으로 정의한다.
 * => 종류
 *    - top level inner class  : static 중첩 클래스
 *    - member inner class     : instance 중첩 클래스
 *    - local inner class      : method 안에 정의한 중첩 클래스
 *    - anonymous inner class  : 이름이 없는 중첩 클래스
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

// 문법 => 상속 - specialization
public class MyCalculator extends Frame {
  // 인스턴스가 존재하는 동안 계속 사용할 값은 
  // 인스턴스 변수에 저장하는 것이 옳다!
  TextField tf1 = new TextField();
  TextField tf2 = new TextField();
  Choice opChooser = new Choice();
  TextField tf3 = new TextField();
  
  public MyCalculator() {
    super("계산기2");
    
    // 레이아웃 매니저 교체: BorderLayout ---> FlowLayout
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
    // MyWindowListener는 중첩 클래스가 아니다. 
    // 왜? 다른 패키지에서도 사용할 가능성이 있기 때문에 그냥 패키지 멤버로 내비두었다.
    addWindowListener(new MyWindowListener());
    
    // ComputeBtnListener는 더 이상 외부 객체가 아니다.
    // MyCalculator의 식구이다.
    // => 같은 식구끼리는 그냥 접근할 수 있다.
    // => 따라서 따로 tf1, tf2, tf3, opChooser를 ComputerBtnListener에 설정할 필요가 없다.
    computeBtn.addActionListener(new ComputeBtnListener());
  }
  
  public static void main(String[] args) {
    MyCalculator f = new MyCalculator();
    f.setVisible(true);
  }

  // member inner class(멤버 중첩 클래스)
  // => 인스턴스 메서드처럼 인스턴스 멤버로 사용된다.
  // => 인스턴스 메서드처럼 다른 인스턴스 멤버(변수와 메서드)를 사용할 수 있다.
  //    ---> 이것이 멤버 중첩 클래스를 사용하는 이유이기도 하다.
  // => 다음 클래스는 MyCalculator에서만 사용할 것이기 때문에 접근 범위를 public으로 할 필요가 없다.
  /*public */class ComputeBtnListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      // 중첩 클래스도 메서드나 변수처럼 해당 클래스의 멤버이기 때문에
      // 바깥 클래스의 인스턴스 멤버에 그냥 접근할 수 있다.
      // => 이것이 중첩 클래스를 사용하는 이유이기도 하다!
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
}















