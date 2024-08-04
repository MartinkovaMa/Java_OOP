package Homework00P;

public class Main03 {
    public static void main(String[] args) {
        // Vytvoření několika instancí třídy Book
        Book book1 = new Book("Jana Eyrová", "Charlotte Brontëová", 1);
        Book book2 = new Book("Vejce a já", "Betty MacDonaldová", 2);
        Book book3 = new Book("Rande", "Halina Pawlovská", 3);

        // Zvýšení popularity knihy book1 o 3
        book1.loanBook();
        book1.loanBook();
        book1.loanBook();

        // Výpis informací o knihách
        System.out.println("Book 1 - Popularity: " + book1.getPopularity());
        System.out.println("Book 2 - Popularity: " + book2.getPopularity());
        System.out.println("Book 3 - Popularity: " + book3.getPopularity());

        // Porovnání knihy book1 s book2 a book3
        System.out.println("Is book1 equal to book2? " + book1.equals(book2)); // false
        System.out.println("Is book1 equal to book3? " + book1.equals(book3)); // false
    }
}

