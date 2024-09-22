package Library;

import java.util.Objects;

public class Book implements Comparable<Book>, Cloneable {
    private String title;
    private String author;
    private int year;
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
     public String getTitle() {
        return title;
    }
     public String getAuthor() {
        return author;
    }
     public int getYear() {
        return year;
    }
      public int compareTo(Book other) {
        return Integer.compare(this.year, other.year);
    }
      public Book clone() {
        try {
            return (Book) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
       public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
            return year == book.year &&
               Objects.equals(title, book.title) &&
               Objects.equals(author, book.author);
    }
         public int hashCode() {
             return Objects.hash(title, author, year);
    }
}

