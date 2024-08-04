package pl.coderslab.oop.attributes;

public class Main03 {

    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println("name : " + person1.getName());
        person1.setName("Mark");
        System.out.println("name : " + person1.getName());

        Person person2 = new Person();
        person2.setName("Peter");
        person2.setSurname("Tan");
        person2.setAge(25);
        person2.setGender('M');
        System.out.println(person2.getName() + " " + person2.getSurname() + " " + person2.getAge() + " " + person2.getGender());

        person2.getFullName();
        String fullName = person2.returnFullName();
        System.out.println(fullName);

        person2.zvysAge();
        System.out.println(person2.getAge());
        person2.zvysAge(5);
        System.out.println(person2.getAge());


        Person person3 = new Person("Pavel", "Pavel");
        System.out.println(person3.getName() + "  " + person3.getSurname());
    }
}
