package lab_one;

import lab_one.factory.Member;
import lab_one.factory.MemberFactory;
import lab_one.prototype.Book;
import lab_one.singleton.Library;

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = Library.getInstance();

        Book prototypeBook = new Book("Five Nights at Freddy's: The Silver Eyes", "Scott Cawthon", "5243693821246", "horror");

        Book book1 = prototypeBook.clone();
        book1.setTitle("Five Nights at Freddy's: The Twisted Ones");
        book1.setIsbn("7854303241543");
        library.addBook(book1);

        Book book2 = prototypeBook.clone();
        book2.setTitle("Five Nights at Freddy's: The Fourth Closet");
        book2.setIsbn("8645490254672");
        library.addBook(book2);

        library.getBooks();

        Member librarian = MemberFactory.createMember("librarian");
        librarian.accessLibraryResources();

        Member student = MemberFactory.createMember("student");
        student.accessLibraryResources();

    }
}
