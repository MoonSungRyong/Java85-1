package step09;

public class Book4 {
  String title;
  String author;
  int pageSize;
  
  public Book4() {}
  
  public Book4(String title, String author, int pageSize) {
    this.title = title;
    this.author = author;
    this.pageSize = pageSize;
  }

  @Override
  public String toString() {
    return "Book4 [title=" + title + ", author=" + author + ", pageSize=" + pageSize + "]";
  }
  
  @Override
  public boolean equals(Object obj) {
    return true;
  }
  
  @Override
  public int hashCode() {
    return 1;
  }
  
}










