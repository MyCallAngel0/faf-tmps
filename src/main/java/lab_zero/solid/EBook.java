package lab_zero.solid;

public class EBook extends Book {

    private final int fileSize;
    public EBook(String title, String author, String isbn, int fileSize) {
        super(title, author, isbn);
        this.fileSize = fileSize;
    }

    @Override
    public String toString() {
        return super.getTitle() + " by " + super.getAuthor() + " (ISBN: " + super.getIsbn() + ", File Size: " + fileSize + "MB)";
    }

    public int getFileSize() {
        return fileSize;
    }

}