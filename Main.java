import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        
        library.addBook(new Book("1984", "George Orwell", "12345"));
        library.addBook(new Book("The Alchemist", "Paulo Coelho", "67890"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "11223"));

       
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        User user = new Student(userName);


        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Borrow a book");
            System.out.println("2. Return a book");
            System.out.println("3. Show available books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input. Try again.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter the title of the book to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    Book bookToBorrow = library.findBookByTitle(borrowTitle);

                    if (bookToBorrow == null) {
                        System.out.println("Book not found in the library.");
                    } else if (bookToBorrow.isIssued()) {
                        System.out.println("Sorry, \"" + borrowTitle + "\" is already issued.");
                    } else {
                        user.borrowBook(bookToBorrow, library);
                    }
                    break;

                case 2:
                    System.out.print("Enter the title of the book to return: ");
                    String returnTitle = scanner.nextLine();
                    Book bookToReturn = library.findBookByTitle(returnTitle);

                    if (bookToReturn == null) {
                        System.out.println("This book is not from our library.");
                    } else if (!bookToReturn.isIssued()) {
                        System.out.println("This book was not issued.");
                    } else {
                        user.returnBook(bookToReturn, library);
                    }
                    break;

                case 3:
                    library.showAvailableBooks();
                    break;

                case 4:
                    System.out.println("Thank you, " + userName + "! Goodbye.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
