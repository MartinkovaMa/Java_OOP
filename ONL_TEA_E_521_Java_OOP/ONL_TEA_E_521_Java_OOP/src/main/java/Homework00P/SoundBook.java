package Homework00P;

 class SoundBook extends Book {
    private double duration;
    private int numberOfCarriers;
     public SoundBook(String title, String author, double duration, int numberOfCarriers) {
         super(title,author,0);
         this.duration = duration;
         this.numberOfCarriers = numberOfCarriers;
     }

     public double getDuration() {
         return duration;
     }

     public int getNumberOfCarriers() {
         return numberOfCarriers;
     }
 }

