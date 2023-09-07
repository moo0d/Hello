package library;

import library.model.Book;
import library.model.LibraryMember;
import library.system.Library;
public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Fairy Tale", "Stephen King", 1668002175);
        Book book2 = new Book("Billy Summers", "Stephen King", 1982173629);
        Book book3 = new Book("Atomic Habits", "James Clear", 735211299);
        /////
        LibraryMember member1 = new LibraryMember("Eelis", 1);
        LibraryMember member2 = new LibraryMember("Santeri", 2);
        LibraryMember member3 = new LibraryMember("Sami", 3);
        /////
        Library library = new Library();
        /////
        library.addMember(member1);
        library.addMember(member2);
        library.addMember(member3);
        /////
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        /////
        library.displayBooks();
        /////
        library.borrowBook(member1, book1);
        System.out.println(" ");
        library.displayBooks();
        member1.displayBorrowedBooks();
        System.out.println(" ");
        ////
        library.returnBook(member1, book1);
        member1.displayBorrowedBooks();
        library.displayBooks();
        System.out.println(" ");
        /////////////////////////////////////////////////////////////////////
        library.reserveBook(member1, book1);
        library.displayReservedBooks(member1);
        library.displayBooks();
        System.out.println(" ");
        library.cancelReservation(member1, book1);
        library.displayReservedBooks(member1);
        library.displayBooks();


    }
}
