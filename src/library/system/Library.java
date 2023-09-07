package library.system;

import library.model.Book;
import library.model.LibraryMember;

import java.util.ArrayList;
import java.util.List;


public class Library {

    private List<Book> books;
    private List<LibraryMember> members;



    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void reserveBook(LibraryMember member, Book book) {
        if(!book.isReserved()) {
            book.setReserved(true);
            member.addReservedBook(book);
            System.out.println("Member: \"" + member.getName() + "\" reserved \"" + book.getTitle() + "\" succesfully.");
        }
        else {
            System.out.println("Book is already reserved. ");
        }
    }

    public void cancelReservation(LibraryMember member, Book book){
        if(member.hasReservedBook(book)) {
            book.setReserved(false);
            member.removeReservedBook(book);
            System.out.println("Member: \"" + member.getName() + "\" cancelled reservation succesfully.");
        }
        else {
            System.out.println("Member: \"" + member.getName() + "\" hasnt reserved this book");
        }
    }

    public void displayReservedBooks(LibraryMember member) {
        if (!member.getReservedBooks().isEmpty()) {
            System.out.println("Reserved books for \"" + member.getName() + "\":");
            for (Book book : member.getReservedBooks()) {
                System.out.println("Author: \"" + book.getAuthor() + "\" Title: \"" + book.getTitle() + "\"");
            }
        }
        else {
            System.out.println("Member: \"" + member.getName() + "\" hasnt reserved books.");
        }
    }
    public void displayBooks() {
        System.out.println("Books in library:");
        for (Book book : books) {
            if (!book.isReserved()) {
                System.out.println("Book: \"" + book.getTitle() + "\" Author: \"" + book.getAuthor() + "\"");
            }
        }
    }
    public void addBook(Book book){
        if(!books.contains(book)){
            books.add(book);
        }
        else {
            System.out.println("ERROR! Duplicate book in library.");
        }
    }
    public void addMember(LibraryMember member){
        if (!members.contains(member)) {
            members.add(member);

        }
        else {
            System.out.println("ERROR! Duplicate user. Try again.");
        }


    }
    public void borrowBook(LibraryMember member, Book book){
        if (members.contains(member) && !book.isReserved()) {
            member.memberBorrowBook(book);
            books.remove(book);
            System.out.println("Member: \"" + member.getName() + "\" Borrowed book: \"" + book.getTitle() + "\"");
        }
        else {
            System.out.println("Member: " + member.getName() + " isnt in library list.");
        }

    }
    public void returnBook(LibraryMember member, Book book){
        if (member.getBorrowedBooks().contains(book)){
            books.add(book);
            member.getBorrowedBooks().remove(book);
            System.out.println("Member: \"" + member.getName() + "\" returned book: " + book.getTitle() + "\"");
        }
        else {
            System.out.println("Member \"" + member.getName() + "\" doesent have this book: " + book.getAuthor());
        }

    }
}
