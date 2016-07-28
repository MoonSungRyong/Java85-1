package step14.ex05;

import java.awt.Label;
import java.awt.Panel;

public class ContactPanel extends Panel {
  private static final long serialVersionUID = 1L;

  ContactDao contactDao;
  
  public ContactPanel() {
    Label label = new Label("연락처관리 화면");
    add(label);
  }

  public void setContactDao(ContactDao contactDao) {
    this.contactDao = contactDao;
  }
  
  
}



