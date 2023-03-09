package com.stackroute.basics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SumOfCommonElementsAppTests {
    private ByteArrayOutputStream myOutStream;

    @BeforeEach
    public void setUp() {
        myOutStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOutStream));
    }

    @AfterEach
    public void tearDown() {
        myOutStream = null;
    }

    @Test
    public void givenUserEntersValidArrayValuesWhenCommonELemnetsFoundThenDisplaysSum() {
        String input = "5 10 20 30 40 50 5 10 15 20 25";
        String output = "30";
        ByteArrayInputStream myInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(myInputStream);
        SumOfCommonElements.main(null);
        String messageOne = "Application Should display the sum of common elements of the given two arrays";
        String actual = myOutStream.toString().trim().replaceAll("\\s+", " ");
        Assertions.assertEquals(output.replaceAll("\\s+", " "), actual, messageOne);
    }

    @Test
    public void givenUserEntersInValidArraySizeWhenArrayConstructedThenDisplaysNoElements() {
        String input = "0 ";
        String output = "No Elements in arrays";
        ByteArrayInputStream myInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(myInputStream);
        SumOfCommonElements.main(null);
        String messageOne = "Application Should display No elements in arrays for empty arrays";
        String actual = myOutStream.toString().toLowerCase().trim().replaceAll("\\s+", " ");
        Assertions.assertEquals(output.toLowerCase().replaceAll("\\s+", " "), actual, messageOne);
    }
}
