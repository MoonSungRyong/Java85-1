package step11;

import java.io.Serializable;

// Serialize를 허용하기
public class Board2 implements Serializable {
  int no;
  String title;
  String contents;
  String writer;
  String createdDate;
  int viewCount;
  String password;

  public Board2() {
    this.no = 1;
    this.title = "제목입니다";
    java.sql.Date today = new java.sql.Date(System.currentTimeMillis());
    String str = today.toString();
    this.createdDate = str;
    this.viewCount = 0;
    this.password = "1111";
  }

  public Board2(String title, String contents, String password) {
    this();
    this.title = title;
    this.contents = contents;
    this.password = password;
  }

  @Override
  public String toString() {
    return "Board2 [no=" + no + ", title=" + title + ", contents=" + contents + ", writer=" + writer + ", createdDate="
        + createdDate + ", viewCount=" + viewCount + ", password=" + password + "]";
  }
}







