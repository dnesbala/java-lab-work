package com.company;

// importing package
import number_pkg.Number;

public class Point {
    private int x, y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        int x= 5;
        Number number = new Number(x);
        System.out.println(x + " is even : "+ number.isEven());
        System.out.println("Factorial of : " + x + " = " + number.getFactorial());
        System.out.println("Square root of : " + x + " = "+ number.getSqrt());
    }
}

