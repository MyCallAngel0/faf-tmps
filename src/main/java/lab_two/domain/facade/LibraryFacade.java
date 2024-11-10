package lab_two.domain.facade;

import lab_two.domain.book.Book;
import lab_two.domain.models.Library;

import java.util.List;

public class LibraryFacade {

    private final Library library;

    public LibraryFacade() {
        library = Library.getInstance();
    }

    public void addBookToLibrary(Book book) {
        library.addBook(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void addBooksToLibrary(List<Book> books) {
        library.addBooks(books);
        System.out.println("Books added to library.");
    }

    public void displayBooksInLibrary() {
        List<Book> books = library.getBooks();
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("List of available books:");
            books.forEach(book -> System.out.println(book.getTitle()));
        }
    }
}

