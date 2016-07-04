/* 주제: Date 클래스 - java.text.DateFormat 사용법
 */
package step09;

import java.text.DateFormat;
import java.util.Calendar;

public class Exam069_6 /*extends Object*/ {
  public static void main(String[] args) {
    Calendar cal = Calendar.getInstance(); // 현재 날짜 및 시간 정보를 가진 달력 객체 생성.
    
    //1) 기본 출력 형식 => 현재 OS에 설정된 국가, 언어, 날짜 형식으로 따른다.
    DateFormat df = DateFormat.getDateInstance();
    String str = df.format(cal.getTime());
    System.out.println(str);
    
    //2) 다른 출력 형식
    df = DateFormat.getDateInstance(DateFormat.FULL);
    str = df.format(cal.getTime());
    System.out.println(str);
    
    
  }

}



















