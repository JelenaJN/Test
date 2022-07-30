package com.bootcampexcercise.module10.activity;

public class InterfaceActivityClass {
    public static void main(String[] args) {

        Bike bike = new Bike();
        bike.start();
        bike.stop();

        Car car = new Car();
        car.start();
        car.stop();
    }
}
