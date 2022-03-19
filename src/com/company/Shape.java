package com.company;

public abstract class Shape {
    double area;

    public abstract void draw();
    void erase() {
        area = 0;
    }
}

class Circle extends Shape {
    double radius = 10.5;

    @Override
    public void draw() {
        area = 2 * Math.PI * radius * radius;
        System.out.println("Area of circle = " + area);
    }

    @Override
    void erase() {
        super.erase();
    }
}

class Triangle extends Shape {
    double height = 9;
    double base = 12.5;

    public void draw() {
        area = height * base / 2;
        System.out.println("Area of rectangle = " + area);
    }
}

class Square extends Shape {
    double length = 7;

    public void draw() {
        area = length * length;
        System.out.println("Area of square = " + area);
    }
}

class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        circle.erase();
        System.out.println("After erasing, Area of circle = " + circle.area);
    }
}


