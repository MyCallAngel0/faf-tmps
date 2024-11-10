package lab_two.domain.models;

import lab_two.domain.book.Book;

public class PhysicalBook extends Book {
    private int pages;

    public PhysicalBook(String title, String author, String isbn, String genre, int pages) {
        super(title, author, isbn, genre);
        this.pages = pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public PhysicalBook clone() {
        return new PhysicalBook(this.getTitle(), this.getAuthor(), this.getIsbn(), this.getGenre(), this.pages);
    }

    @Override
    public String getDetails() {
        return "Physical Book - Nr of pages: " + pages;
    }
}

