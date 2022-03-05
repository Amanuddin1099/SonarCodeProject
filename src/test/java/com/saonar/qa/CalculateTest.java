package com.saonarp.qa;

import com.sonar.dev.Calculate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculateTest {

    @Test
    @DisplayName("Addition 5+7=12 Successful")
    public void additionTest() {
        Calculate calculate = new Calculate();
        calculate.addition(5, 7);
        assertEquals(12, calculate.addition(5, 7));

    }

    @Test
    @DisplayName("Subtraction 4-3=1 Successful")
    public void subtractionTest() {
        Calculate calculate = new Calculate();
        calculate.subtraction(4, 3);
        assertEquals(1, calculate.subtraction(4, 3));
    }

    @Test
    @DisplayName("Divide 100/10=10 Successful")
    public void divideTest() {
        Calculate calculate = new Calculate();
        calculate.divide(100, 10);
        assertEquals(10, calculate.divide(100, 10));
    }

    @Test
    @DisplayName("Multiply 10*10=100 Successful")
    public void multiplyTest() {
        Calculate calculate = new Calculate();
        calculate.multiply(10, 10);
        assertEquals(100, calculate.multiply(10, 10));
    }
}
