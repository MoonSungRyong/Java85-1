package step06;

public class Book {
  String title;
  String author;
  
  public Book() {
    System.out.println("Book()");
  }
  
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getAuthor() {
    return author;
  }
  public void setAuthor(String author) {
    this.author = author;
  }
  @Override
  public String toString() {
    return "Book [title=" + title + ", author=" + author + "]";
  }
  
  
}
