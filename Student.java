public class Student extends User {
    public Student(String name) {
        super(name);
    }

    @Override
    public void borrowBook(Book book, Library library) {
        library.issueBook(book, this);
    }

    @Override
    public void returnBook(Book book, Library library) {
        library.returnBook(book, this);
    }
}
