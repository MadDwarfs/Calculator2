package com.calculator2.kodillacalculator2;

public class Calculator {

    public double addition(double a,double b){
        System.out.println("The sum of this addition is: ");
        return a+b;
    }

    public double substraction(double a,double b){
        System.out.println("The result of this substraction is: ");
        return a-b;
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.addition(25.5,76));
        System.out.println(calculator.substraction(52,57));
    }

}
