package com.stackroute.unittest.pe1;

import org.junit.Test;
import static org.junit.Assert.*;

public class LoopTest {

    @Test

    public void Test1(){
        Loop l = new Loop();
        String s1 = l.PrintLoop(3);
        assertEquals("122333", s1);
    }

    @Test

    public void Test2(){
        Loop l = new Loop();
        String s1 = l.PrintLoop(-3);
        assertEquals("Negative Number", s1);
    }
}
