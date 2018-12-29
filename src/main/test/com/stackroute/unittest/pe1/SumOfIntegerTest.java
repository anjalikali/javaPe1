package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfIntegerTest {
    SumOfInteger obj;
    @Before
    public void setUp() throws Exception {
        SumOfInteger obj = new SumOfInteger();
    }

    @After
    public void tearDown() throws Exception {
        SumOfInteger obj = null;
    }

    @Test
    public void checkSum() {
        SumOfInteger sot = new SumOfInteger ();
        int a = sot.checkSum ("12 34 56");
        assertEquals (102,a);
    }
}