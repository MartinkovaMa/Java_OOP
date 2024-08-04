package pl.coderslab.oop.methods;

public class Main03 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Lisa");
        person.setSurname("Monelli");

        System.out.println(person.getFullName());
    }
}
