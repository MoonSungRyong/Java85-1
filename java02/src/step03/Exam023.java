// 주제: 연산자 사용 - 비트 이동 연산자 활용2
package step03;

public class Exam023 {
  public static void main(String[] args) {
    byte[] arr = {0x70, 0x60, 0x40, 0x20};
    int value = 0;

    // 바이트 배열의 값을 int 변수에 저장하라!
    /*
    value = arr[0] << 24;
    value += arr[1] << 16;
    value += arr[2] << 8;
    value += arr[3];
    */
    for (int i = 0, j = 24; i < arr.length; i++, j -= 8) {
      value += arr[i] << j;
    }

    System.out.println(Integer.toHexString(value));
  }

}

/*
# 직렬화(Serialize = marshaling)
- 특정 변수의 값을 바이트 배열로 바꾸는 것

# 역직렬화(Deserialize = unmarshaling)
- 바이트 배열을 특정 변수의 값으로 복원하는 것
*/
