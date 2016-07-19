package step11;

import java.io.Serializable;

// Serialize를 허용하기
// + 클래스 버전 정보
// => 출력할 데이터에 클래스의 버전 정보를 기록함으로써 
//    읽는 쪽에서 버전 정보를 확인하여 읽을 지 말 지 결정할 수 있다.
public class Board3 implements Serializable {
  // Deserialize 하는 쪽에서 사용하는 데이터이다.
  private static final long serialVersionUID = 1L; // 인스턴스 값을 직력화시킬 때 추가할 버전정보
  
  int no;
  String title;
  String contents;
  String writer;
  String createdDate;
  int viewCount;
  String password;

  public Board3() {
    this.no = 1;
    this.title = "제목입니다";
    java.sql.Date today = new java.sql.Date(System.currentTimeMillis());
    String str = today.toString();
    this.createdDate = str;
    this.viewCount = 0;
    this.password = "1111";
  }

  public Board3(String title, String contents, String password) {
    this();
    this.title = title;
    this.contents = contents;
    this.password = password;
  }

  @Override
  public String toString() {
    return "Board3 [no=" + no + ", title=" + title + ", contents=" + contents + ", writer=" + writer + ", createdDate="
        + createdDate + ", viewCount=" + viewCount + ", password=" + password + "]";
  }
}







