package lab_three.domain.facade;

import lab_three.domain.book.Book;
import lab_three.domain.iterator.Iterator;
import lab_three.domain.models.Library;

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
        if (library.isEmpty()) {
            System.out.println("No books available!");
            return;
        }
        System.out.println("List of available books:");
        for(Iterator iter = library.getIterator(); iter.hasNext();){
            System.out.println(iter.next().getTitle());
        }
    }
}
