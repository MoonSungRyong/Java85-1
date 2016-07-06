/* 학습목표
 * => 상속의 활용
 *    - 기존의 코드를 재사용할 수 있다.
 *    - 기존 코드에 기능을 쉽게 덧붙일 수 있다.
 *    - .class 파일만 있으면 상속 받을 수 있다. 상속 받는데 소스 파일이 필요 없다.
 * => 생성자의 의미
 *    - 객체를 사용하기 전에 유효한 값으로 초기화시키는 메서드
 *    - 객체가 사용할 자원을 준비시키는 메서드
 *    - 객체 생성 후 자동으로 호출된다.
 */
package step10.exam079;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.TextField;

public class MessageInputBox extends Panel {
  public MessageInputBox() {
    super();
    
    // FlowLayout 배치 관리자를 BorderLayout으로 교체한다.
    setLayout(new BorderLayout());
    
    TextField inputField = new TextField();
    
    /* FlowLayout 기본 배치 관리자를 사용할 경우,
    // FlowLayout 배치 관리자는 setSize() 설정된 너비와 높이 값을 사용하지 않는다.
    //inputField.setSize(200, 30); 
    // FlowLayout 배치 관리자는 이 메서드로 설정된 너비와 높이 값을 사용한다.
    //inputField.setPreferredSize(new Dimension(200, 30)); 
    */    
    //add(inputField); <== FlowLayout일 경우,
    add(inputField, BorderLayout.CENTER);
    
    Button sendBtn = new Button("Send");
    //add(sendBtn); <== FlowLayout일 경우,
    add(sendBtn, BorderLayout.EAST);
  }
}







