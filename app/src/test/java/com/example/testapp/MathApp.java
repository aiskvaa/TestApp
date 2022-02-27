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
    public void addTest() {
        assertEquals(12, math.add("7", "5"));
    }

    @After
    public void detach() {
        math = null;
    }
}
