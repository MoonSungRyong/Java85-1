/* 주제 : 이너 클래스 사용법 - 로컬 이너 클래스
 * => 특정 메서드에서만 사용할 클래스일 경우 이 문법을 사용한다.
 */
package step10.exam084;

import java.util.ArrayList;

public class Test10 {
  public static void main(String[] args) {
    // main() 메서드에서만 사용할 클래스 
    class Cookie {
      String name;
      int price;
      
      public Cookie(String name, int price) {
        this.name = name;
        this.price = price;
      }

      @Override
      public String toString() {
        return "Cookie [name=" + name + ", price=" + price + "]";
      }
    }
    
    ArrayList<Cookie> list = new ArrayList<>();
    list.add(new Cookie("새우깡", 1000));
    list.add(new Cookie("맛동산", 1200));
    list.add(new Cookie("오징어땅콩", 1300));
    list.add(new Cookie("웨하스", 1400));
    list.add(new Cookie("샤브레", 1500));
    list.add(new Cookie("초코파이", 1600));
    
    for (Cookie c : list) {
      System.out.println(c);
    }
  }
  
  static void m() {
    //Cookie p; // main()에서 선언한 로컬 이너 클래스는 이렇게 다른 메서드에서 사용할 수 없다.
  }
}





