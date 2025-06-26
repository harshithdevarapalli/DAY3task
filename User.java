public abstract class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    public abstract void borrowBook(Book book, Library library);
    public abstract void returnBook(Book book, Library library);
}
