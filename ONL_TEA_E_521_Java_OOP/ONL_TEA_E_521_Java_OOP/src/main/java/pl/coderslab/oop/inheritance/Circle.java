package pl.coderslab.oop.inheritance;

public class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    public String getDescription() {
        return "This is a " + this.getColor() + " circle.";
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getCircuit() {
        return 2 * Math.PI * this.radius;
    }

}