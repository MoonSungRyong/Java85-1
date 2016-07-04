/* 주제: Date 클래스 - java.text.SimpleDateFormat 사용법
 * => 기존 DateFormat 클래스는 출력 형식이 고정되어 있고, 몇가지 안된다.
 * => 그래서 자바는 사용자 입맛에 맞게 출력 형식을 지정할 수 있도록
 *    DataFormat 클래스에 기능을 덧붙인 SimpleDateFormat 클래스를 제공한다.
 */
package step09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exam069_7 /*extends Object*/ {
  public static void main(String[] args) throws Exception {
    Calendar cal = Calendar.getInstance(); // 현재 날짜 및 시간 정보를 가진 달력 객체 생성.
    
    // Date --> String
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String str = df.format(cal.getTime());
    System.out.println(str);
    
    // String --> Date
    Date date = df.parse("2016-07-02 15:05:00");
    System.out.println(date);
  }

}



















