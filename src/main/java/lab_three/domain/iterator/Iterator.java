package lab_three.domain.iterator;

import lab_three.domain.book.Book;

public interface Iterator {
    boolean hasNext();
    Book next();
}
