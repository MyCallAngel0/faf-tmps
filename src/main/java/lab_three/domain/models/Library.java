package lab_three.domain.models;

import lab_three.domain.book.Book;
import lab_three.domain.iterator.Container;
import lab_three.domain.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Library implements Container {

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

    public void addBooks(List<Book> books) {
        this.books.addAll(books);
    }

    public boolean isEmpty() {
        return books.isEmpty();
    }

    @Override
    public Iterator getIterator() {
        return new BooksIterate();
    }

    private class BooksIterate implements Iterator {
        int position = 0;

        @Override
        public boolean hasNext() {
            if (position < books.size()) {
                return true;
            }
            return false;
        }

        @Override
        public Book next() {
            return books.get(position++);
        }
    }
}

