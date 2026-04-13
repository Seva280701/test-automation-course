package com.bootcampexcercise.module9.activity;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Class: PersonTest
 *
 * This class contains tests for Person class.
 *
 * @author Seva
 */
public class PersonTest {

    Person person = new Person();

    @Test
    public void testSetAndGetWeight() {
        person.setWeight(70);
        assertEquals(70, person.getWeight());
    }

    @Test
    public void testSetAndGetHeight() {
        person.setHeight(1.75f);
        assertEquals(1.75f, person.getHeight(), 0.001f);
    }

    @Test
    public void testBodyMassIndexNormal() {
        String result = person.getBodyMassIndex(1.75f, 70);
        assertEquals("Normal", result);
    }

    @Test
    public void testBodyMassIndexInvalidZero() {
        String result = person.getBodyMassIndex(0, 70);
        assertEquals("Invalid input: height and weight must be greater than 0", result);
    }

    @Test
    public void testBodyMassIndexInvalidNegative() {
        String result = person.getBodyMassIndex(-1.5f, 70);
        assertEquals("Invalid input: height and weight must be greater than 0", result);
    }

    @Test
    public void testBodyMassIndexInvalidTooLarge() {
        String result = person.getBodyMassIndex(5.0f, 800);
        assertEquals("Invalid input: unrealistic values", result);
    }
}