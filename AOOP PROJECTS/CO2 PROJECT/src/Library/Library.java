package Library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Library implements Iterable<Book> {
    private List<Book> books;
     public Library() {
        books = new ArrayList<>();
    }
      public void addBook(Book book) {
        books.add(book.clone());
    }
      public void sortBooksByYear() {
        Collections.sort(books);
    }
     public void sortBooksByTitle() {
        books.sort(BookComparator.compareByTitle());
    }
     public void sortBooksByAuthor() {
        books.sort(BookComparator.compareByAuthor());
    }
       public Iterator<Book> iterator() {
        return books.iterator();
    }
     public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
