package step13;

import java.beans.PropertyEditorSupport;

/* String ---> step13.Press 
 */

public class PressEditor extends PropertyEditorSupport {
  @Override
  public void setAsText(String text) throws IllegalArgumentException {
    try {
      // 문자열 형식: "출판사명,전화"
      String[] values = text.split(",");
      
      Press p = new Press();
      p.setName(values[0]);
      p.setTel(values[1]);
      
      this.setValue(p);
      
    } catch (Exception e) {
      throw new IllegalArgumentException(e);
    }
  }
}








