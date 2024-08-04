package pl.coderslab.oop.inheritance;

public class Main02 {
    public static void main(String[]args) {
        Shape shape1 = new Shape(1, 1, "red");
        System.out.println(shape1.getDescription());
        Shape shape2 = new Shape(10, 10, "green");
        System.out.println("Distance shape2 from shape1 : " + String.valueOf(shape2.getDistance(shape1)));

        Circle circle1 = new Circle(1, 1, "blue", 3);
        System.out.println(circle1.getDescription());
        System.out.println("Area: " +String.valueOf(circle1.getArea()));
        System.out.println("Circuit: " +String.valueOf(circle1.getCircuit()));

        Circle circle2 = new Circle(10, 10, "black", 4);
        System.out.println("Distance circle2 from circle1 : " + String.valueOf(circle2.getDistance(circle1)));
    }
}
