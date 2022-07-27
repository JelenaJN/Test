package com.bootcampexcercise.module5.activity;

public class AbstractActivity {
    public static void main(String args[]) {
        // set and Print color of rectangle
        // Give area of rectangle
        // Print perimeter of rectangle

        // set and Print color of circle
        // Give area of circle
        // Print perimeter of circle


    Rectangle rectangle = new Rectangle(5, 6);
        double perimeter = rectangle.calculatePerimeter();
        System.out.println("Perimeter = " + perimeter);

        double area = rectangle.calculateArea();
        System.out.println("Area = " + area);

        rectangle.setColor("Pink");
        String color = rectangle.getColor();
        System.out.println("Color = " + color);

        Circle circle = new Circle(5);
        perimeter = circle.calculatePerimeter();
        System.out.println("Perimeter = " + perimeter);

        area = circle.calculateArea();
        System.out.println("Area = " + area);

        circle.setColor("Green");
        color = circle.getColor();
        System.out.println("Color = " + color);

    }
}


