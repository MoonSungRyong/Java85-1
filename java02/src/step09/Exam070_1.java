/* 주제: 랩퍼 클래스 - 소개
 * => 랩퍼(wrapper) 클래스?
 *    - 자바 원시 데이터 타입(primitive data type)을 객체로 다루기 위해 만든 클래스
 *    - byte, short, int, long, float, double, boolean, char
 *      byte    => java.lang.Byte
 *      short   => java.lang.Short
 *      int     => java.lang.Integer
 *      long    => java.lang.Long
 *      float   => java.lang.Float
 *      double  => java.lang.Double
 *      char    => java.lang.Character
 *      boolean => java.lang.Boolean
 */
package step09;

public class Exam070_1 {
  public static void main(String[] args) throws Exception {
    byte b = 10;
    Byte obj1 = new Byte(b);
    
    short s = 10;
    Short obj2 = new Short(s);
    
    int i = 10;
    Integer obj3 = new Integer(i);
    
    long l = 10L;
    Long obj4 = new Long(l);
    
    float f = 3.14f;
    Float obj5 = new Float(f);
    
    double d = 3.14;
    Double obj6 = new Double(d);
    
    char c = '가';
    Character obj7 = new Character(c);
    
    boolean bool = true;
    Boolean obj8 = new Boolean(bool);
    
  }

}



















