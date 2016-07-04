/* 주제: Date 클래스 - java.util.Calendar 사용법
 */
package step09;

import java.util.Calendar;

public class Exam069_4 /*extends Object*/ {
  public static void main(String[] args) {
    Calendar cal = Calendar.getInstance(); // 현재 날짜 및 시간 정보를 가진 달력 객체 생성.
    
    // 항목 번호: 년(1), 월(2), 일(5), 시(12시간:10, 24시간:11), 분(12), 초(13)
    // 상수 사용 전: 무지 불편하다. 
    System.out.printf("%d-%d-%d %d:%d:%d\n", 
        cal.get(1), 
        cal.get(2) + 1,
        cal.get(5),
        cal.get(11),
        cal.get(12),
        cal.get(13));
    
    // 상수 사용 후: 코드가 읽기 편하다. 이해가 빠르다.
    System.out.printf("%d-%d-%d %d:%d:%d\n", 
        cal.get(Calendar.YEAR), 
        cal.get(Calendar.MONTH) + 1,
        cal.get(Calendar.DAY_OF_MONTH),
        cal.get(Calendar.HOUR_OF_DAY),
        cal.get(Calendar.MINUTE),
        cal.get(Calendar.SECOND));
    
  }

}



















