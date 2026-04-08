package com.bnmit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(4, calc.add(2, 2));
    }

    @Test
    void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.subtract(5, 3));
    }

    @Test
    void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    void testDivide() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.divide(4, 2));
    }
}