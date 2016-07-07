package designpatterns.iterator.step01;

public class Test {
  public static void main(String[] args) {
    String[] arr = {
        "홍길동", "임꺽정", "이순신", "유관순", "안중근", "윤봉길", "김구",
        "안창호", "강감찬", "장보고", "을지문덕"
    };
    
    //1) 이름을 순서대로 출력하기
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + ",");
    }
    System.out.println();
    
    //2) 이름을 역순으로 출력하기
    for (int i = arr.length -1; i >= 0; i--) {
      System.out.print(arr[i] + ",");
    }
    System.out.println();
    
    //3) 홀수 인덱스의 이름을 출력하기
    for (int i = 1; i < arr.length; i += 2) {
      System.out.print(arr[i] + ",");
    }
    System.out.println();
    
    //4) 짝수 인덱스의 이름을 출력하기
    for (int i = 0; i < arr.length; i += 2) {
      System.out.print(arr[i] + ",");
    }
    System.out.println();
    
    
  }
}





