package step10;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Book4 {
  String title;
  String[] authors;
  int[] sizes;
  int pages;
  boolean local;
  Date releaseDate;
  Press press;
  
  public Book4() {
    System.out.println("Book4()");
  }

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

  public int[] getSizes() {
    return sizes;
  }

  public void setSizes(int[] sizes) {
    this.sizes = sizes;
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
    return "Book4 [title=" + title + ", authors=" + Arrays.toString(authors) + ", sizes=" + Arrays.toString(sizes)
        + ", pages=" + pages + ", local=" + local + ", releaseDate=" + releaseDate + ", press=" + press + "]";
  }

  

  
    
  
}
