package lab_one.singleton;

import lab_one.prototype.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private static Library instance;

    private List<Book> books = new ArrayList<>();

    private Library () {}

    public static Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void getBooks() {
        System.out.println("List of available books:");
        this.books.forEach(book -> System.out.println(book.getTitle()));
    }
}
