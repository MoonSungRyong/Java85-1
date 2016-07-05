package step09;

public class Book5 {
  String title;
  String author;
  int pageSize;
  
  public Book5() {}
  
  public Book5(String title, String author, int pageSize) {
    this.title = title;
    this.author = author;
    this.pageSize = pageSize;
  }

  @Override
  public String toString() {
    return "Book5 [title=" + title + ", author=" + author + ", pageSize=" + pageSize + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((author == null) ? 0 : author.hashCode());
    result = prime * result + pageSize;
    result = prime * result + ((title == null) ? 0 : title.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Book5 other = (Book5) obj;
    if (author == null) {
      if (other.author != null)
        return false;
    } else if (!author.equals(other.author))
      return false;
    if (pageSize != other.pageSize)
      return false;
    if (title == null) {
      if (other.title != null)
        return false;
    } else if (!title.equals(other.title))
      return false;
    return true;
  }


  
}










