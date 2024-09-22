package Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("The Java Project", "Ch.Sai Deekshita", 2005));
        library.addBook(new Book("The Aiml Project", "Sreya", 2006));
        library.addBook(new Book("The Operating System", "Raghuram", 2004));
        library.addBook(new Book("The Social", "Ch.Ritvic", 2010));
        library.addBook(new Book("The Linux", "Lavnaya", 2007));

        System.out.println("Books sorted by Year:");
        library.sortBooksByYear();
        library.displayBooks();

        System.out.println("\nBooks sorted by Title:");
        library.sortBooksByTitle();
        library.displayBooks();

        System.out.println("\nBooks sorted by Author:");
        library.sortBooksByAuthor();
        library.displayBooks();
    }
}
