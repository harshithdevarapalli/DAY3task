# 📚 Library Management System (Java Console App)

A simple **Library Management System** built using **Java** that demonstrates key **Object-Oriented Programming (OOP)** principles like **abstraction**, **inheritance**, **polymorphism**, and **encapsulation**.

This console-based system allows a user to:
- Enter their name
- Borrow a book by title
- Return a book by title
- View available books

---

## ✨ Features

- ✅ Issue a book if available
- ✅ Return a previously issued book
- ❌ Show error if book doesn't exist
- ❌ Show error if book is already issued or not issued
- 🔁 User interaction via console (Scanner)

---

## 🧠 OOP Concepts Used

| Concept         | Implementation Example                          |
|----------------|--------------------------------------------------|
| **Abstraction** | `User` is an abstract class                     |
| **Inheritance** | `Student` class inherits from `User`           |
| **Polymorphism**| `borrowBook()` and `returnBook()` overridden   |
| **Encapsulation**| `Book` class uses private fields and setters  |

---

Sample Interaction
mathematica
Copy
Edit
Enter your name: Alice

--- Library Menu ---
1. Borrow a book
2. Return a book
3. Show available books
4. Exit
Enter your choice: 1
Enter the title of the book to borrow: 1984
Alice has issued "1984".

