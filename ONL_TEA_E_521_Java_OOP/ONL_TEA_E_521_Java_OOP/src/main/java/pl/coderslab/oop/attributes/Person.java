package pl.coderslab.oop.attributes;

public class Person {
    private String name = "John";
    private String surname = "Malone";
    private int age = 38;
    private char gender = 'M';
    public Person() {
    }
    public Person(String name,String surname){
        this.name = name;
        this.surname = surname;
    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
}
public Person(String name, String surname, int age, char gender) {
    this.name = name;
    this.surname = surname;
    this.age = age;
    this.gender = gender;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void getFullName() {
        System.out.println("FullName: " + name + " " + surname);
    }

    public String returnFullName() {
        return name + " " + surname;
    }

    public void zvysAge() {
        this.age = this.age + 1;
    }

    public void zvysAge(int n) {
        this.age = this.age + n;
    }


}