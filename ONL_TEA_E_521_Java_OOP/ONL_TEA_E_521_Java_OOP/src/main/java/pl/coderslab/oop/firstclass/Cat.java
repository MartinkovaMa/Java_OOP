package pl.coderslab.oop.firstclass;

public class Cat {

    private String name;
    private String breed;
    private int age;

    public Cat(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void meows(){
        System.out.println("Meows, Meows ...");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}

