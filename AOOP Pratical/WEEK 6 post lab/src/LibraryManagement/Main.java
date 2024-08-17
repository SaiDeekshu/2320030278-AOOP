package LibraryManagement;

public class Main {
    public static void main(String[] args) {
        // Create books
        Book book1 = new Book("1984", "George Orwell", "123456789");
        Book book2 = new Book("Brave New World", "Aldous Huxley", "987654321");

        // Create members
        Member member1 = new Member("Alice", "M001");
        Member member2 = new Member("Bob", "M002");

        // Create borrowing rule and library system
        BorrowingRule standardRule = new StandardBorrowingRule();
        LibrarySystem library = new LibrarySystem(standardRule);

        // Demonstrate borrowing and returning books
        library.borrowBook(book1, member1);
        library.borrowBook(book2, member2);

        library.returnBook(book1, member1);
        library.returnBook(book2, member2);
    }
}