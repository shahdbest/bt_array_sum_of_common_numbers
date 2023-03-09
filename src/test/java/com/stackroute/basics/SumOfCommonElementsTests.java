package com.stackroute.basics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SumOfCommonElementsTests {
    private static final String MESSAGE_ONE = "Should return sum of the common elements in two arrays";
    private static final String MESSAGE_TWO = "Should return 0 if there are no common elements";
    private static final String MESSAGE_THREE = "Should return -1 if the arrays are empty";
    private static SumOfCommonElements sumOfCommonELements;

    @BeforeEach
    public void setUp() {
        // This methods runs, before running each test case
        // This method is used to initialize the required variables
        sumOfCommonELements = new SumOfCommonElements();
    }

    @AfterEach
    public void tearDown() {
        // This method runs, after each test case
        // This method is used to clear the initialized variables
        sumOfCommonELements = null;
    }

    @Test
    public void givenTwoArraysWithValidSizeHavingCommonElementsWhenCommonElementsFoundThenMethodReturnsTheirSum() {
        int[] arrayOne = {10, 20, 30, 40, 50};
        int[] arrayTwo = {5, 10, 15, 20, 25};
        int sumExpected = 30;
        int sumActual = sumOfCommonELements.calculateSumOfCommonElements(arrayOne, arrayTwo);
        Assertions.assertEquals(sumExpected, sumActual, MESSAGE_ONE);
    }

    @Test
    public void givenTwoArraysWithValidSizeAndNegativeIntegerValuesHavingCommonElementsWhenCommonElementsFoundThenMethodReturnsTheirSum() {
        int[] arrayOne = {1, -3, 2, -7};
        int[] arrayTwo = {-1, -3, -5, -7};
        int sumExpected = -10;
        int sumActual = sumOfCommonELements.calculateSumOfCommonElements(arrayOne, arrayTwo);
        Assertions.assertEquals(sumExpected, sumActual, MESSAGE_ONE);
    }

    @Test
    public void givenTwoArraysWithValidSizeHavingUncommonElementsWhenCommonElementsNotFoundThenMethodReturnsZero() {
        int[] arrayOne = {10, 20, 30, 40, 50};
        int[] arrayTwo = {1, 2, 3, 4, 5};
        int sumExpected = 0;
        int sumActual = sumOfCommonELements.calculateSumOfCommonElements(arrayOne, arrayTwo);
        Assertions.assertEquals(sumExpected, sumActual, MESSAGE_TWO);
    }

    @Test
    public void givenTwoArraysWithZeroSizeInFirstArrayWhenCommonElementsNotFoundThenMethodReturnsMinusOne() {
        int[] arrayOne = {10, 20, 30, 40, 50};
        int[] arrayTwo = {};
        int sumExpected = -1;
        int sumActual = sumOfCommonELements.calculateSumOfCommonElements(arrayOne, arrayTwo);
        Assertions.assertEquals(sumExpected, sumActual, MESSAGE_THREE);
    }

    @Test
    public void givenTwoArraysWithZeroSizeInSecondArrayWhenCommonElementsNotFoundThenMethodReturnsMinusOne() {
        int[] arrayOne = {};
        int[] arrayTwo = {10, 20, 30, 40, 50};
        int sumExpected = -1;
        int sumActual = sumOfCommonELements.calculateSumOfCommonElements(arrayOne, arrayTwo);
        Assertions.assertEquals(sumExpected, sumActual, MESSAGE_THREE);
    }

    @Test
    public void givenTwoArraysWithZeroSizeThenMethodReturnsMinusOne() {
        int[] arrayOne = {};
        int[] arrayTwo = {};
        int sumExpected = -1;
        int sumActual = sumOfCommonELements.calculateSumOfCommonElements(arrayOne, arrayTwo);
        Assertions.assertEquals(sumExpected, sumActual, MESSAGE_THREE);
    }

}
