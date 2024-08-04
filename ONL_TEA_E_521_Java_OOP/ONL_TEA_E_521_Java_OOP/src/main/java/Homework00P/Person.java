package Homework00P;

public class Person {
    private int id = 123456;
    private String firstName = "Alan";
    private String lastName = "Delon";

    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}




