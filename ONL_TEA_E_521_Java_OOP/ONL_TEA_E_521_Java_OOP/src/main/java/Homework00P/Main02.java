package Homework00P;

public class Main02 {
    public static void main(String[] args) {
    // Vytvoření instance třídy SoundBook
    SoundBook soundBook = new SoundBook("Alenka z říše divů", "Lewis Carroll", 120.5, 2);

    // Výpis informací o SoundBook
        System.out.println("Title: " + soundBook.getTitle());
        System.out.println("Author: " + soundBook.getAuthor());
        System.out.println("Duration: " + soundBook.getDuration());
        System.out.println("Number of Carriers: " + soundBook.getNumberOfCarriers());
}
}

