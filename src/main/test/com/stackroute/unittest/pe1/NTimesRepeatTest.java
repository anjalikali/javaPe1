package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NTimesRepeatTest {

    NTimesRepeat obj;
        @Test
        public void repeatstr()
        {
             NTimesRepeat str = new NTimesRepeat ();
             String s1 = str.repeateStr ("anjali", 2);
             assertEquals ("anjalilili",s1);

        }

    @Before
    public void setUp() throws Exception {
        NTimesRepeat obj = new NTimesRepeat ();
    }

    @After
    public void tearDown() throws Exception {
        NTimesRepeat obj = null;
    }

}

