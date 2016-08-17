package step10;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Book3 {
  String title;
  Map<String,Author> authorMap;
  int pages;
  boolean local;
  Date releaseDate;
  Press press;
  
  public Book3() {
    System.out.println("Book()");
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Map<String, Author> getAuthorMap() {
    return authorMap;
  }

  public void setAuthorMap(Map<String, Author> authorMap) {
    this.authorMap = authorMap;
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
    return "Book3 [title=" + title + ", authorMap=" + authorMap + ", pages=" + pages + ", local=" + local
        + ", releaseDate=" + releaseDate + ", press=" + press + "]";
  }

  
    
  
}
