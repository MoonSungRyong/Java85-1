package step10;

import java.util.Arrays;
import java.util.Date;

public class Book {
  String title;
  Author[] authors;
  int pages;
  boolean local;
  Date releaseDate;
  Press press;
  
  public Book() {
    System.out.println("Book()");
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Author[] getAuthors() {
    return authors;
  }

  public void setAuthors(Author[] authors) {
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
    return "Book [title=" + title + ", authors=" + Arrays.toString(authors) + ", pages=" + pages + ", local=" + local
        + ", releaseDate=" + releaseDate + ", press=" + press + "]";
  }
  
  
  
  
  
    
  
}
