package step14.ex05;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Book {
  String title;
  String[] authors;
  int pages;
  boolean local;
  Date releaseDate;
  
  @Autowired(required=false) 
  @Qualifier("press2") 
  Press press;
  
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String[] getAuthors() {
    return authors;
  }
  public void setAuthors(String[] authors) {
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
  
  @Override
  public String toString() {
    return "Book [title=" + title + ", authors=" + Arrays.toString(authors) + ", pages=" + pages + ", local=" + local
        + ", releaseDate=" + releaseDate + ", press=" + press + "]";
  }
  
 
 
    
  
}
