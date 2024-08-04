package Homework00P;

import pl.coderslab.oop.attributes.Person;

public class Main01 {
    public static void main(String[] args) {
        Author author = new Author(33,"Bill","Hill");
        User user = new User(2436,"Judy","Lawrence");
        // Výpis informací o autorovi
        System.out.println("Author:");
        System.out.println("ID: " + author.getId());
        System.out.println("Name: " + author.getFirstName() + " " + author.getLastName());
        // Výpis informací o Userovi
        System.out.println("User:");
        System.out.println("ID: " + user.getId());
        System.out.println("Name: " + user.getFirstName() + " " + user.getLastName());
}
}
