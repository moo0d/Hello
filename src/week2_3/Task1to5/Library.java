package week2_3.Task1to5;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
        } else {
            System.out.println("List contains this book.");
        }
    }

    public void displayBooks() {
        System.out.println("Library Catalog:");
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.println((i + 1) + ". Title: \"" + book.getTitle() + "\", Author: " + book.getAuthor()
                    + ", Year: " + book.getPubYear());
        }
        System.out.println(" ");

    }

    public void findBooksByAuthor(String author) {
        boolean check = false;
        System.out.println("Books By Author \"" + author + "\":");
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                check = true;
                System.out.println("Title: \"" + book.getTitle() + "\", Author: " + book.getAuthor()
                        + ", Year: " + book.getPubYear());
            }
        }
        if (!check) {
            System.out.println("No books found by " + author);
        }
    }

    public void borrowBook(String title, User user) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (user.getBorrowedBooks().contains(book)) {
                    System.out.println("This book is already borrowed by " + user.getName());
                    return;
                }
                user.borrowBook2(book);
                books.remove(book);
                System.out.println(user.getName() + " borrowed the book: \"" + title + "\"");
                return;
            }
        }
        System.out.println("Book \"" + title + "\" not found in the library");
    }

    public void returnBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
            System.out.println("Book: \"" + book.getTitle() + "\" has been returned.");
        }
    }

    public boolean isBookAvalaible(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return true;

            }

        }
        return false;
    }

    public Object getAverageBookRating() {
        if (!books.isEmpty()) {
            double counter;
            double total = 0;
            double averageRating;
            for (Book book : books) {
                counter = book.getRating();
                total = total + counter;
            }
            averageRating = total / books.size();
            return averageRating;
        }
        return null;
    }

    public Object getMostReviewedBook() {
        if (!books.isEmpty()) {
            Book mostReviewed = null;
            int maxReviews = 0;
            for (Book book : books) {
                int numReviews = book.getReviews().size();
                if (numReviews > maxReviews) {
                    maxReviews = numReviews;
                    mostReviewed = book;
                }
            }
            return mostReviewed.getTitle();
        }
        return null;
    }

    public void addUser(User user) {
        users.add(user);
    }
    public void displayUsersBorrowedBooks() {
        for (User user : users) {
            System.out.println("---------------------");
            System.out.println("User: \"" + user.getName() + "\" Age: \"" + user.getAge() + "\"");
            System.out.println("Borrowed Books:");
            for (Book book : user.getBorrowedBooks()) {
                System.out.println(book.getTitle()+ ", " + book.getAuthor() + ", " + book.getPubYear());

            }
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        Book book = new Book("Holly", "Stephen King", 2023);
        Book book2 = new Book("The Body", "Stephen King", 2018);
        Book book3 = new Book("The Mist", "Stephen King", 2018);
        Book book4 = new Book("Atomic Habits", "James Clear", 2018);
        User user1 = new User("Matti", 20);
        User user2 = new User("Pekka", 30);
        library.addBook(book);
        library.addBook(book2);
        //library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.displayBooks();
        //library.findBooksByAuthor("stephen king");
        //library.borrowBook("Holly");
        //library.borrowBook("asd");
        library.displayBooks();
        library.returnBook(book);
        library.displayBooks();
        //System.out.println(library.isBookAvalaible("asd"));
        book.addReview("Hyvä kirja!");
        book.addReview("Todella hyvä kirja 5/5!");
        book2.addReview("5/5");
        book.setRating(1);
        book2.setRating(3);
        book3.setRating(5);
        book4.setRating(5);
        //System.out.println(book.getReviews());
        System.out.println(library.getAverageBookRating());
        System.out.println(library.getMostReviewedBook());
        //////////////////////////////////////////////
        System.out.println(" ");
        library.addUser(user1);
        library.addUser(user2);
        //user1.borrowBook2(book);
        //user1.borrowBook2(book2);
        //user2.borrowBook2(book4);
       //user2.borrowBook2(book2);
        System.out.println(" ");
        library.borrowBook("the mist", user1);
        library.borrowBook("the body", user1);
        library.borrowBook("atomic habits", user2);
        library.borrowBook("the mist", user2);
        library.displayUsersBorrowedBooks();


    }
}