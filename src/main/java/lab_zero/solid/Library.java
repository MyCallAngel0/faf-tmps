package lab_zero.solid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private List<Book> books;
    private List<Member> members;
    private Map<Book, Member> checkedOutBooks;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
        checkedOutBooks = new HashMap<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void checkoutBook(Member member, Book book) {
        if (books.contains(book) && !checkedOutBooks.containsKey(book)) {
            checkedOutBooks.put(book, member);
            books.remove(book);
            System.out.println(member + " checked out " + book + ".");
        } else {
            System.out.println("Sorry, " + book + " is not available.");
        }
    }

    public void returnBook(Book book) {
        if (checkedOutBooks.containsKey(book)) {
            Member member = checkedOutBooks.remove(book);
            books.add(book);
            System.out.println(member + " returned " + book + ".");
        } else {
            System.out.println(book + " was not checked out.");
        }
    }
}
