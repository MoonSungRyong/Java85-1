/* 주제: Date 클래스 - java.sql.Date 소개
 */
package step09;

import java.sql.Date;

public class Exam069_2 /*extends Object*/ {
  public static void main(String[] args) {
    Object obj = new Object();
    System.out.println(obj);
    
    long currTime = System.currentTimeMillis();  
    
    Date today = new Date(currTime);
    // 같은 이름의 클래스를 동시에 사용하고 싶다면,
    // 한 클래스의 이름은 전체 이름(패키지명을 포함한 이름)으로 지정하라!
    java.util.Date today2 = new java.util.Date(currTime);

    // println(객체주소) => 해당 객체의 toString() 호출하여 그 리턴 값을 출력한다.
    System.out.println(today); // java.sql.Date => "yyyy-MM-dd"
    System.out.println(today2); // java.util.Date
    
  }

}







