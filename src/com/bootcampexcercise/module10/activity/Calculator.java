package com.bootcampexcercise.module10.activity;

public class Calculator {

    public int add(int x, int y) {
        return x + y;
    }

    public double add(double x, double y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public String divide(int x, int y) {
        int divValue;
        try {
            divValue = x / y;
        } catch (Exception a) {
            return "Cannot divide by zero";
        }
        return "" + divValue;
    }

    public String multiply(int x, int y) throws CustomException {
        try {
            if (y == 0) {
                throw new CustomException();
            }
        } catch (CustomException e) {
            return e.getMessage();
        }
        return "" + (x * y);
    }
}
