package Homework00P;

public class Main04 {
    public static void main(String[] args) {
        // Vytvoření instance uživatele
        User user = new User(1, "John", "Doe");

        // Vytvoření několika instancí knih
        Book book1 = new Book("Temnota 1", "Stephen King 1", 1);
        Book book2 = new Book("Pavučina Lží 2", "Stephen King 2", 2);
        Book book3 = new Book("Strach 3", "Stephen King 3", 3);

        // Půjčení knih uživatelem
        user.borrowBook(book1);
        user.borrowBook(book2);
        user.borrowBook(book3);

        // Výpis počtu vypůjčených knih
        System.out.println("Number of borrowed books: " + user.getBorrowedBooksCount());

        // Vrácení knih uživatelem
        user.returnBook(book1);
        user.returnBook(book2);

        // Výpis počtu vypůjčených knih po vrácení
        System.out.println("Number of borrowed books after return: " + user.getBorrowedBooksCount());
    }
}
