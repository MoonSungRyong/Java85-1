/*문제
1) 숫자가 주어지면 해당 순서에 있는 알파벳을 출력한다.
   순서는 0부터 시작한다.
   0: A
   1: B
2) 실행 및 출력 예:
>java Test21 5
F
>java Test21 30
존재하지 않는 알파벳입니다.
*/


public class Test21 {
  public static void main(String[] args) {
    int no = Integer.parseInt(args[0]);

    char ch = 'A'; // A 문자의 유니코드 값이 저장. 0x0041 = 65
    System.out.println((char)(ch + no));
    System.out.println(44032);
    System.out.println((char)44032);
  }


}




/**/
