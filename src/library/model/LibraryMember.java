package library.model;


import java.util.ArrayList;
import java.util.List;

public class LibraryMember {

    private String name;
    private long memberId;
    private List<Book> borrowedBooks;
    private List<Book> reservedBooks;

    public LibraryMember(String name, long memberId) {
        this.name = name;
        this.memberId = memberId;
        borrowedBooks = new ArrayList<>();
        reservedBooks = new ArrayList<>();
    }

    public void addReservedBook(Book book){
        reservedBooks.add(book);
    }
    public void removeReservedBook(Book book) {
        reservedBooks.remove(book);
    }
    public boolean hasReservedBook(Book book) {
        return reservedBooks.contains(book);
    }
    public List<Book> getReservedBooks(){
        return reservedBooks;
    }

    public String getName() {
        return name;
    }

    public long getMemberId() {
        return memberId;
    }
    public void memberBorrowBook(Book book) {
        borrowedBooks.add(book);
    }
    public void displayBorrowedBooks() {
        if (!borrowedBooks.isEmpty()) {
            for (Book book : borrowedBooks){
                System.out.println("Member: \"" + name + "\" Books: \"" + book.getTitle() + "\"");
            }
        }
        else {
            System.out.println("Member \"" + name + "\" hasnt borrowed books.");
        }
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

}
