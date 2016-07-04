/* 주제: Date 클래스 - java.util.Calendar 사용법2
 */
package step09;

import java.util.Calendar;

public class Exam069_5 /*extends Object*/ {
  public static void main(String[] args) {
    Calendar cal = Calendar.getInstance(); // 현재 날짜 및 시간 정보를 가진 달력 객체 생성.
    
    System.out.printf("%d-%d-%d %d:%d:%d\n", 
        cal.get(Calendar.YEAR), 
        cal.get(Calendar.MONTH) + 1,
        cal.get(Calendar.DAY_OF_MONTH),
        cal.get(Calendar.HOUR_OF_DAY),
        cal.get(Calendar.MINUTE),
        cal.get(Calendar.SECOND));

    cal.add(Calendar.DAY_OF_MONTH, -7);
    System.out.printf("%d-%d-%d %d:%d:%d\n", 
        cal.get(Calendar.YEAR), 
        cal.get(Calendar.MONTH) + 1,
        cal.get(Calendar.DAY_OF_MONTH),
        cal.get(Calendar.HOUR_OF_DAY),
        cal.get(Calendar.MINUTE),
        cal.get(Calendar.SECOND));
    
  }

}



















