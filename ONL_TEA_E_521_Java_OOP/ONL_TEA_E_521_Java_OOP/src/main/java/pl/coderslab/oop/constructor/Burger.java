package pl.coderslab.oop.constructor;

//import pl.coderslab.oop.firstclass.Cat;
public class Burger {

    private String size;
    private double price;

    //private Cat cat;

    public Burger(){
       // System.out.println("This is constructor Burger()");
        //Cat cat = new Cat();
        //cat.setName("CatA");
        }

    public Burger(String size,double price){
        this.price = price;
        this.size = size;
        System.out.println("This is constructor Burger(size, price) " + this.size + " " + this.price);
    }

    public void initializeBurger(String size, double price){
        this.price = price;
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
    //public void catActivity(){
    //    cat.eat();
    //}
//}
