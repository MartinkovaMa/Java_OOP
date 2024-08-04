package pl.coderslab.oop.constructor;
import java.util.Arrays;

public class Calculator {
    private String[] history;

    public Calculator() {
        this.history = new String[0];
    }
    public String[] getHistory() {
        return history;
    }
    public void setHistory(String[] history) {
        this.history = history;
    }

    protected void addHistory(String operation){
        String[] temp = new String[this.history.length + 1];
        System.arraycopy(this.history,0,temp, 0,this.history.length);
        temp[this.history.length] = operation;
        this.history = new String[this.history.length + 1];
        System.arraycopy(temp,0,this.history, 0,this.history.length-1);
        this.history[this.history.length-1] = operation;
    }
    public int add(int num1,int num2){
        int result = num1 + num2;
        addHistory("added "+num1+" to "+num2+" got "+result );
        return result;
    }
    public int multiply(int num1,int num2) {
        int result = num1 * num2;
        addHistory("multiplied "+num1+" to "+num2+" got "+result );
        return result;
    }
    public int substract(int num1,int num2) {
        int result = num1 - num2;
        return result;
    }
    public int divide(int num1,int num2) {
        int result = num1 / num2;
        addHistory("divided "+num1+" by "+num2+" got "+result );
        return result;
    }
    public void printOperations(int num1,int num2) {
       System.out.println(Arrays.toString(this.history));
}
    public void clearOperations(){
        this.history = new String[0];
    }
}