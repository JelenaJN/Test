package com.bootcampexcercise.module5.activity;

public class Circle extends Shape{
    // TODO: Implement calculateArea and calculatePerimeter in this class
    int radius;
    double pi = 3.14;

    public Circle(){
    }

    public Circle(int radius) {
        this.radius = radius;
    }


    public double calculateArea() {
        return pi * radius * radius;
    }


    public double calculatePerimeter() {
        return pi * radius * 2;
    }
}