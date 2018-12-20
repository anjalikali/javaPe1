package com.stackroute.unittest.pe1;

import org.junit.Test;
import static org.junit.Assert.*;

public class randomGuessTest {

    @Test

    public void outoflimit()
    {
        randomGuess rg = new randomGuess();
        String s1 = rg.randomguessnumber(600, 700);
        assertEquals("out of limit", s1);
    }
}
