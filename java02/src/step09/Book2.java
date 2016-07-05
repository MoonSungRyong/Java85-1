package step09;

public class Book2 {
  String title;
  String author;
  int pageSize;
  
  public Book2() {}
  
  public Book2(String title, String author, int pageSize) {
    this.title = title;
    this.author = author;
    this.pageSize = pageSize;
  }

  @Override
  public String toString() {
    return "Book2 [title=" + title + ", author=" + author + ", pageSize=" + pageSize + "]";
  }
  
  @Override
  public int hashCode() {
    return 1;
  }
  
}










