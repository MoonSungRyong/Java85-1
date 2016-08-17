package step10;

import java.util.Date;
import java.util.List;

public class Book2 {
  String title;
  List<Author> authors;
  int pages;
  boolean local;
  Date releaseDate;
  Press press;
  
  public Book2() {
    System.out.println("Book()");
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public List<Author> getAuthors() {
    return authors;
  }

  public void setAuthors(List<Author> authors) {
    this.authors = authors;
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

  public Press getPress() {
    return press;
  }

  public void setPress(Press press) {
    this.press = press;
  }

  @Override
  public String toString() {
    return "Book2 [title=" + title + ", authors=" + authors + ", pages=" + pages + ", local=" + local + ", releaseDate="
        + releaseDate + ", press=" + press + "]";
  }

  
  
    
  
}
