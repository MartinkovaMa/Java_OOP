package pl.coderslab.oop.methods;

public class Person {
    public String name = "John";
    public String surname = "Malone";
    public int age = 30;
    public char gender = 'M';

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
//ex3
    public String getFullName(){
        return this.name + " " + this.surname;
    }
//ex4
    public int increaseAge(){
        return this.age + 1;
    }
}

