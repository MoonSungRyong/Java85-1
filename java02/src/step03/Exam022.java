// 주제: 연산자 사용 - 비트 이동 연산자 활용
package step03;

public class Exam022 {
  public static void main(String[] args) {
    int value = 0x70604020; // 01110000 01100000 01000000 00100000
    byte[] arr = new byte[4];

    // value 변수에 있는 값을 바이트 배열로 저장하라!
    // arr[0] = 01110000
    // arr[1] = 01100000
    // arr[2] = 01000000
    // arr[3] = 00100000
    arr[0] = (byte)(value >> 24);
    arr[1] = (byte)(value >> 16);
    arr[2] = (byte)(value >> 8);
    arr[3] = (byte)value;

    for (int i = 0; i < arr.length; i++) {
      System.out.println(Integer.toHexString(arr[i]));
    }
  }

}

/*
# 직렬화(Serialize = marshaling)
- 특정 변수의 값을 바이트 배열로 바꾸는 것

# 역직렬화(Deserialize = unmarshaling)
- 바이트 배열을 특정 변수의 값으로 복원하는 것
*/
