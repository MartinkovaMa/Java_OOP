package pl.coderslab.oop.firstclass;

public class Main01 {

    public static void main(String[] args) {
        Dog dog = new Dog("Raf", "German Sheppard", 3);

        System.out.println("Dog's name: " + dog.getName());
        System.out.println("Dog's breed: " + dog.getBreed());
        System.out.println("Dog's age: " + dog.getAge());
        dog.bark();
        dog.eat();
        dog.sleep();

        Cat cat = new Cat("Minda", "Persian Cat", 2);

        System.out.println("Cat's name: " + cat.getName());
        System.out.println("Cat's breed: " + cat.getBreed());
        System.out.println("Cat's age: " + cat.getAge());
        cat.meows();
        cat.eat();
        cat.sleep();

//        if (cat == dog){
//            System.out.println("Compare dog and cat.");
//        }

        if (cat.equals(dog)){
            System.out.println("cat == dog");
        }else{
            System.out.println("cat != dog");
        }

    }
}
