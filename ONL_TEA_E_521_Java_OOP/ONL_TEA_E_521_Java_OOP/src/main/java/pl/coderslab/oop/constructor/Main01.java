package pl.coderslab.oop.constructor;

public class Main01 {
    public static void main(String[] args) {
        // Vytvoření prvního burgeru
        Burger burger1 = new Burger();
        System.out.println("Burger1 " + burger1.getSize() + " " + burger1.getPrice());
        burger1.initializeBurger("small", 5.50);
        System.out.println("Burger1 " + burger1.getSize() + " " + burger1.getPrice());

        // Vytvoření druhého burgeru
        Burger burger2 = new Burger("large", 10.50);
        System.out.println("Burger2 " + burger2.getSize() + " " + burger2.getPrice());
        burger2.initializeBurger("large", 12.50);
        System.out.println("Burger2 " + burger2.getSize() + " " + burger2.getPrice());

        // Aktivita kočky spojená s prvním burgerem
       // burger1.catActivity();
    }
}