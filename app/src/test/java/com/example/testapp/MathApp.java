package com.example.testapp;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathApp {

    Math math;

    @Before
    public void init() {
        math = new Math();
    }

    @Test
    public void SimpleAddTest() {
        assertEquals("17", math.add("12", "5"));
    }

    @Test
    public void simpleDivideTest() {
        assertEquals("1", math.divide("2", "2"));
    }

    @Test
    public void simpleMultiplyTest() {
        assertEquals("49", math.multiply("7", "7"));
    }

    @Test
    public void simpleSubtractionTest() {
        assertEquals("70", math.subtract("80", "10"));
    }

    @Test
    public void addIncludingSpacesTestCase() {
        assertEquals("17", math.add("      12", "                        5"));
    }

    @Test
    public void addWithSpacesTestCase() {
        assertEquals("17", math.add("  12  ", "  5  "));
    }


    @Test
    public void simpleDivideWithZeroTest() {
        assertEquals("0", math.divide("0", "2"));
    }

    @Test
    public void addWithSymbols() {
        assertEquals("Символы вводить нельзя удод","2","2");
    }

    @Test
    public void doesIncludeSpecialCharacters() {
        assertEquals("Ошибка, обнаружены специальные символы-", math.areSymbolsIncluded("#@#@!#@!7416", "381"));
    }

    @Test
    public void isDividedByZero() {
        assertEquals("число 2 ,  не можете разделить на ноль", math.dividedByZero("2", "0"));
    }

    @After
    public void detach() {
        math = null;
    }
}
