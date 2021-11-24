package com.epam.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAddShouldAddWhenNumbersPositive() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(1, 2);

        //then
        Assert.assertEquals(3, result);
    }

    @Test
    public void testAddShouldAddWhenNumbersNegaitve() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(-1, -2);

        //then
        Assert.assertEquals(-3, result);
    }

    @Test
    public void testDifferenceShouldDifferenceWhenNumbersNegaitve() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.difference(-1, -2);

        //then
        Assert.assertEquals(1, result);
    }

    @Test
    public void testDifferenceShouldDifferenceWhenNumbersPositive() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.difference(1, 2);

        //then
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testShouldMultiplyWhenNumbersPositive() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.multiply(1, 2);

        //then
        Assert.assertEquals(2, result);
    }

    @Test
    public void testShouldMultiplyWhenNumbersNegative() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.multiply(-1, -2);

        //then
        Assert.assertEquals(2, result);
    }

    @Test
    public void testShouldDivideWhenNumbersNegative() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.divide(-1, -2);

        //then
        Assert.assertEquals(0, result);
    }

    @Test
    public void testShouldDivideWhenNumbersPositive() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.divide(1, 2);

        //then
        Assert.assertEquals(0, result);
    }
}
