package Library;
import java.util.Comparator;
public class BookComparator {
public static Comparator<Book> compareByTitle() {
        return new Comparator<Book>() {
            public int compare(Book b1, Book b2) {
                return b1.getTitle().compareToIgnoreCase(b2.getTitle());
            }
        };
    }
public static Comparator<Book> compareByAuthor() {
        return new Comparator<Book>() {
            public int compare(Book b1, Book b2) {
                return b1.getAuthor().compareToIgnoreCase(b2.getAuthor());
            }
        };
    }
}
