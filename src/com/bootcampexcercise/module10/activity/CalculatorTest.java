package com.bootcampexcercise.module10.activity;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    private Calculator calculator;

    protected void setUp() throws Exception {
        super.setUp();
        calculator = new Calculator();
    }

    protected void tearDown() throws Exception {
        calculator = null;
        super.tearDown();
    }

    public void testAdd1() {
        int result = 10;
        assertEquals(result, calculator.add(5, 5));
    }

    public void testAdd2() {
        int result = 25;
        assertEquals(result, calculator.add(10, 15));
    }

    public void testAdd3() {
        double result = 19.0;
        assertEquals(result, calculator.add(9.7, 9.3));
    }

    public void testAdd4() {
        double result = 0.1;
        assertEquals(result, calculator.add(0.0, 0.1));
    }

    public void testSubtract1() {
        int result = 8;
        assertEquals(result, calculator.subtract(18, 10));
    }

    public void testSubtract2() {
        int result = -2;
        assertEquals(result, calculator.subtract(0, 2));
    }

    public void testDivide() {
        String result = "6";
        assertEquals(result, calculator.divide(24, 4));
    }

    public void testDivide2() {
        String result = "Cannot divide by zero";
        assertEquals(result, calculator.divide(2, 0));
    }

    public void testMultiply1() throws CustomException {
        String result = "24";
        assertEquals(result, calculator.multiply(6, 4));
    }

    public void testMultiply2() throws CustomException {
        String result = "Invalid input";
        assertEquals(result, calculator.multiply(5, 0));
    }
}
