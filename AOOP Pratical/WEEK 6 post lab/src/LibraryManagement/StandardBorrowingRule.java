package LibraryManagement;

public class StandardBorrowingRule implements BorrowingRule {
    @Override
    public boolean canBorrow(Book book) {
        return book.isAvailable();
    }
}
