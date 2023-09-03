package week2_3.Task1to5;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title, author;
    private int pubYear;
    private double rating;
    private List<String> reviews;
    public Book(String title, String author, int pubYear) {
        this.title = title;
        this.author = author;
        this.pubYear = pubYear;
        this.rating = 0.0;
        this.reviews = new ArrayList<>();

    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPubYear() {
        return pubYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }

    public void setRating(double rating) {
        if (rating <= 5 && rating >= 1) {
            this.rating = rating;
        }
        else {
            System.out.println("(rating must be between 1-5!)");
        }
    }

    public double getRating() {
        return rating;
    }
    public void addReview(String review) {
        reviews.add(review);

    }

    public List<String> getReviews() {
        return reviews;
    }
}


