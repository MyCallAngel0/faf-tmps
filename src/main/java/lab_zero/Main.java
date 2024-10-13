package lab_zero;
import lab_zero.solid.*;

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