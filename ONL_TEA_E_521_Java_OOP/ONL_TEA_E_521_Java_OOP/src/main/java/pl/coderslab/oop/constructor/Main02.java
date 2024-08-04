package pl.coderslab.oop.constructor;

public class Main02 {
    public static void main(String[]args){
        Calculator calc1 = new Calculator();
        calc1.add(2,3);
        calc1.substract(10,50);
        calc1.divide(100,10);
        calc1.multiply(4,5);
        calc1.clearOperations();
        calc1.add(10,15);
    }
}


