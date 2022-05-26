// Programmer: Shane Dwyer
// Date: May 26, 2022
// Program Name: SimpleCalculatorTest.java
// Description: Simple tests for a simple calculator program that takes 2 numbers to either add, subtract or divide


package com.keyin.qap1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    void twoPlusTwoShouldEqualFour(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(4,calculator.add(2,2));
        assertTrue(calculator.add(2,2)==4);

    }
    @Test
    void sevenPlusTwoShouldEqualNine(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(9, calculator.add(7, 2));
        assertNotEquals(10, calculator.add(7,2));
    }
    @Test
    void fourMinusTwoEqualsTwo(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(2, calculator.sub(4,2));
        assertNotNull(calculator);
    }
    @Test
    void tenDividedByTwoEqualsFive(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(5, calculator.div(10, 2));
        assertNotEquals(20, calculator.div(10,2));
    }
}