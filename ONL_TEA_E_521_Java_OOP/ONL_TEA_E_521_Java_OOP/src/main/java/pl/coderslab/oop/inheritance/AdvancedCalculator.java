package pl.coderslab.oop.inheritance;

import pl.coderslab.oop.constructor.Calculator;
public class AdvancedCalculator extends Calculator {
    public double pow(double num1, double num2) {
        double result= Math.pow(num1,num2);
        this.addHistory(num1 + " ^ " + num2 + " equals " + result);
        return result;
    }

    public double root(double num1, double num2) {
        double result = Math.pow(num1, 1.0 / num2);
        this.addHistory(num1 + " root of " + num2 + " equals " + result);
        return result;
    }
    }

