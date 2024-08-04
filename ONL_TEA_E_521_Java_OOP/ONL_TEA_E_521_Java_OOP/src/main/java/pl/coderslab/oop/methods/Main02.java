package pl.coderslab.oop.methods;

public class Main02 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Lisa");
        person.setSurname("Word");
        person.setAge(35);
        person.setGender('W');

        System.out.println(person.getFullName());
        System.out.println(person.increaseAge());

        Car car = new Car();
        car.setBrand("Ford");
        car.setModel("Focus");
        car.setPrice(30000);

        System.out.println("brand:     " + car.getBrand());
        System.out.println("brand:     " + car.getModel());
        System.out.println("brand:     " + car.getPrice());
        System.out.println("car price: " + car.toString());
    }
}
