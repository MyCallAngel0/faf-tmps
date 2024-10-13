# FAF-TMPS

---

## Table of Contents

- [Lab 0](#lab-0)

---

## Lab 0


### Objectives

---
Implement 2 SOLID letters in a simple project.

### Implementation

---

For this laboratory I decided to write code that implements the first
two letters from the SOLID Principle: Single Responsibility Principle and Open/Closed Principle.
We have a class for Book and a class for Member that a single responsibility, that being managing their required data.
```
public class Book {
    private final String title;
    private final String author;
    private final String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
}
```

```
public class Member {
    private final String name;
    private final String surname;
    private final int id;

    public Member(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }
}
```
The Library class uses OCP in the way of making it open for extension by being able to add new book types like EBook 
without changing any existing code inside the class, making it closed for modification.
```
public class Library {
    private List<Book> books;
    private List<Member> members;
    private Map<Book, Member> checkedOutBooks;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
        checkedOutBooks = new HashMap<>();
    }
}
```
Here is the EBook class:
```
public class EBook extends Book {

    private final int fileSize;
    public EBook(String title, String author, String isbn, int fileSize) {
        super(title, author, isbn);
        this.fileSize = fileSize;
    }
}
```
I then use Main class to implement some code that makes use of these classes and principles:
```
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Lord of the Rings", "J. R. R. Tolkien", "1345823484530");
        Book book2 = new Book("Five Nights at Freddy's: The Silver Eyes", "Scott Cawthon", "5243693821246");
        EBook ebook = new EBook("Java 101", "Monty Jarvis", "1453426043353", 5);

        Member member1 = new Member("Spataru", "Ion", 1);
        Member member2 = new Member("Bob", "The Builder", 2);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(ebook);

        library.addMember(member1);
        library.addMember(member2);

        library.checkoutBook(member1, book1);
        library.checkoutBook(member2, ebook);
        library.returnBook(book1);
    }
}
```

---

### Result
![Lab0 Screenshot](./screenshots/Screenshot_0.png)

---

### Conclusion
In conclusion, by using 2 letters from the SOLID principle, Single Responsibility Principle(SRP) and Open/Closed Principle(OCP),
it has been shown that it makes the code more clean and flexible, making it readable for everyone and easier to implement new content.
By printing out the result, we can see that even without changing the Library class, by adding the EBook class to
the Book category we added new functionality to it.


