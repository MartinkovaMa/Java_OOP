package Homework00P;
import java.util.ArrayList;
import java.util.List;

public class User extends Person {
    private int borrowedBooksCount; // Count of borrowed books

    public User(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
        this.borrowedBooksCount = 0;
    }

    public void borrowBook(Book book) {
        book.borrowBook(); // Mark the book as borrowed
        borrowedBooksCount++; // Increase the count of borrowed books
    }

    public void returnBook(Book book) {
        book.returnBook(); // Mark the book as available for borrowing
        borrowedBooksCount--; // Decrease the count of borrowed books
    }

    public int getBorrowedBooksCount() {
        return borrowedBooksCount;
    }
}