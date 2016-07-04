/* 주제: Collection 클래스 - 컬렉션 클래스 사용 전2
 * => 배열을 크기를 조정하기
 */
package step09;

import java.util.Scanner;

public class Exam071_2 {
  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);
    String[] names = new String[5];
    
    int i = 0;
    String name;
    while (true) {
      name = keyScan.nextLine();
      if (name.equals("")) 
        break;
      
      names[i] = name;
      i++;
      
      // 만약 배열을 모두 사용했다면, 
      if (i == names.length) {
        // => 새 배열을 만들어 크기를 넓힌다. 
        String[] newArray = new String[names.length + 2]; // 2칸 증가
        
        // => 기존 배열의 값을 새 배열로 옮긴다.
        for (int y = 0; y < names.length; y++) {
          newArray[y] = names[y];
        }
        
        // => 새로 만든 배열을 names 배열로 만든다.
        names = newArray;
        System.out.println("배열이 작아서 2칸 늘렸습니다!");
      }
    }
    
    System.out.println("--------------------");
    for (int x = 0; x < i; x++) {
      System.out.println(names[x]);
    }
    keyScan.close();
  }

}



















