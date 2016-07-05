package step09;

public class Book3 {
  String title;
  String author;
  int pageSize;
  
  public Book3() {}
  
  public Book3(String title, String author, int pageSize) {
    this.title = title;
    this.author = author;
    this.pageSize = pageSize;
  }

  @Override
  public String toString() {
    return "Book3 [title=" + title + ", author=" + author + ", pageSize=" + pageSize + "]";
  }
  
  @Override
  public boolean equals(Object obj) {
    return true;
  }
  
}










