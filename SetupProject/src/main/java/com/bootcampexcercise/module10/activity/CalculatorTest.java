package com.bootcampexcercise.module10.activity;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Class: CalculatorTest
 *
 * This class contains unit tests for Calculator class.
 * Uses JUnit 4.
 */
public class CalculatorTest {

    Calculator calc = new Calculator();

    // ===== ADD TESTS =====

    @Test
    public void testAddTwoNumbers() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testAddThreeNumbers() {
        assertEquals(6, calc.add(1, 2, 3));
    }

    @Test
    public void testAddNegative() {
        assertEquals(1, calc.add(-1, 2));
    }

    @Test
    public void testAddZero() {
        assertEquals(2, calc.add(2, 0));
    }

    // ===== SUBTRACT TESTS =====

    @Test
    public void testSubtract() {
        assertEquals(2, calc.subtract(5, 3));
    }

    @Test
    public void testSubtractNegative() {
        assertEquals(-1, calc.subtract(2, 3));
    }

    // ===== DIVIDE TESTS =====

    @Test
    public void testDivide() {
        assertEquals(2, calc.divide(4, 2));
    }

    @Test
    public void testDivideByZero() {
        assertEquals(0, calc.divide(5, 0));
    }

    // ===== MULTIPLY TESTS =====

    @Test
    public void testMultiply() throws Exception {
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    public void testMultiplyInvalid() {
        try {
            calc.multiply(-2, 3);
            fail("Exception expected");
        } catch (Exception e) {
            assertEquals("Invalid input", e.getMessage());
        }
    }
}