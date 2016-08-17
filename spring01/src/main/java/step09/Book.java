package step09;

import java.util.Date;

public class Book {
  String title;
  String author;
  int pages;
  boolean local;
  Date releaseDate;
  Press press;
  
  public Book() {
    System.out.println("Book()");
  }
  
  public Book(String title, String author, Press press) {
    System.out.println("Book(String,String,Press)");
    this.title = title;
    this.author = author;
    this.press = press;
  }
  
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    System.out.println("setTitle()");
    this.title = title;
  }
  public String getAuthor() {
    return author;
  }
  public void setAuthor(String author) {
    System.out.println("setAuthor()");
    this.author = author;
  }

  public int getPages() {
    return pages;
  }

  public void setPages(int pages) {
    System.out.println("setPages()");
    this.pages = pages;
  }

  public boolean isLocal() {
    return local;
  }

  public void setLocal(boolean local) {
    System.out.println("setLocal()");
    this.local = local;
  }

  public Date getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(Date releaseDate) {
    System.out.println("setReleaseDate()");
    this.releaseDate = releaseDate;
  }

  public Press getPress() {
    return press;
  }

  public void setPress(Press press) {
    System.out.println("setPress()");
    this.press = press;
  }

  @Override
  public String toString() {
    return "Book [title=" + title + ", author=" + author + ", pages=" + pages + ", local=" + local + ", releaseDate="
        + releaseDate + ", press=" + press + "]";
  }
  
  
  
    
  
}
