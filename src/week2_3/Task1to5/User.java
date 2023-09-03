package week2_3.Task1to5;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private int age;
    private List<Book> borrowedBooks;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook2(Book book) {
        borrowedBooks.add(book);
    }

}
// Create a User class with attributes like name, age, and a list of borrowed books.
// Modify the Library class to keep track of library users and their borrowed books.