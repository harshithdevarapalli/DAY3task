import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void issueBook(Book book, User user) {
        book.setIssued(true);
        System.out.println(user.name + " has issued \"" + book.getTitle() + "\".");
    }

    public void returnBook(Book book, User user) {
        book.setIssued(false);
        System.out.println(user.name + " has returned \"" + book.getTitle() + "\".");
    }

    public void showAvailableBooks() {
        System.out.println("\nAvailable Books:");
        boolean found = false;
        for (Book book : books) {
            if (!book.isIssued()) {
                System.out.println("- " + book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books are currently available.");
        }
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}
