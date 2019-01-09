package org.fasttrackit;

public class Exercise {
    public double x;
    public double y;
    public double result;

    public double sumOfTwoNumbers(double x, double y){
        double result = x + y;
        System.out.println("The sum is: " + result);
        return result;
    }
    public int sumOfTwoNumbers(int x, int y){
        int result = x + y;
        System.out.println("The sum is: " + result);
        return result;
    }

    public double devide(double x, double y){
        double result = x / y;
        System.out.println("The result is: " + result);
        return result;
    }

    public int devide(int x, int y){
        int result = x / y;
        System.out.println("The result is: " + result);
        return result;
    }
    public double minus(double x, double y){
        double result = x - y;
        System.out.println("The result is: " + result);
        return result;
    }

    public int minus(int x, int y){
        int result = x - y;
        System.out.println("The result is: " + result);
        return result;
    }

    public double average(double x, double y){
        double result = (x + y) / 2;
        System.out.println("The result is: " + result);
        return result;
    }

    public int average(int x, int y){
        int result = (x + y) / 2;
        System.out.println("The result is: " + result);
        return result;    }


}
