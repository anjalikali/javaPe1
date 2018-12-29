package com.stackroute.unittest.pe1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringReverseTest {

    StringReverse obj;

    @Test
    public void stringrev()
    {
        StringReverse str = new StringReverse ();
        String s1 = str.revStr ("anjali");
        assertEquals ("ilajna", s1);
    }
    @Before
    public void setUp() throws Exception {
        StringReverse obj = new StringReverse ();
    }

    @After
    public void tearDown() throws Exception {
        StringReverse obj = null;
    }


}
