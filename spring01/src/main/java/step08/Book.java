package step08;

import java.util.Date;

public class Book {
  String title;
  String author;
  int pages;
  boolean local;
  Date releaseDate;
  
  public Book() {
    System.out.println("Book()");
  }
  
  public Book(int pages) {
    System.out.println("Book(int)");
    this.pages = pages;
  }
  
  public Book(String title) {
    System.out.println("Book(String)");
    this.title = title;
  }
  

  public Book(String title, String author) {
    System.out.println("Book(String,String)");
    this.title = title;
    this.author = author;
  }
  
  public Book(String title, int pages) {
    System.out.println("Book(String,int)");
    this.title = title;
    this.pages = pages;
  }
  
  public Book(int pages, String title) {
    System.out.println("Book(int,String)");
    this.title = title;
    this.pages = pages;
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

  public int getPages() {
    return pages;
  }

  public void setPages(int pages) {
    this.pages = pages;
  }

  public boolean isLocal() {
    return local;
  }

  public void setLocal(boolean local) {
    this.local = local;
  }

  public Date getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(Date releaseDate) {
    this.releaseDate = releaseDate;
  }
  
  @Override
  public String toString() {
    return "Book [title=" + title + ", author=" + author + ", pages=" + pages + ", local=" + local + ", releaseDate="
        + releaseDate + "]";
  }
  
  
  
}
