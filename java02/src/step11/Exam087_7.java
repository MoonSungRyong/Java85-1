/* 주제: 파일을 다루는 도구 - FileOutputStream/FileInputStream 사용법4 
 * => 바이트 배열 출력
 * => 바이트 배열을 전문으로 출력하는 메서드를 사용하기 
 */
package step11;

import java.io.FileOutputStream;

public class Exam087_7 {

  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("Exam087_7.dat");
    
    byte[] bytes = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    
    //out.write(bytes, 0, 10);  // write(배열, 시작인덱스, 출력할개수)
    out.write(bytes);
    
    out.close();
    System.out.println("저장하였습니다.");
  }

}










