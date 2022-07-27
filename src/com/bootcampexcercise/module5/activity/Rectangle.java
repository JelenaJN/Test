package com.bootcampexcercise.module5.activity;

public class Rectangle extends Shape {

    // TODO: Implement calculateArea and calculatePerimeter in this class
    int length;
    int breadth;

    public Rectangle() {
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    public double calculateArea() {
        return length * breadth;
    }


    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}