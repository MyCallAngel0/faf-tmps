package lab_three.domain.models;

import lab_three.domain.book.Book;

public class EBook extends Book {
    private final String memory;

    public EBook(String title, String author, String isbn, String genre, String fileFormat) {
        super(title, author, isbn, genre);
        this.memory = fileFormat;
    }

    @Override
    public EBook clone() {
        return new EBook(this.getTitle(), this.getAuthor(), this.getIsbn(), this.getGenre(), this.memory);
    }

    @Override
    public String getDetails() {
        return "EBook - Storage Space: " + memory;
    }
}
