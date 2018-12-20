package com.stackroute.unittest.pe1;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Scanner;

public class TomandJerryTest {

    @Test
    public void  tomtest(){
        TomJerry result = new TomJerry();
        String a2 = result.TomorJerry(23);
        assertEquals("Tom",a2);

    }
    @Test

        public void jerrytest()
        {
            TomJerry result = new TomJerry();
            Scanner sc = new Scanner("24");
            String a1 = result.TomorJerry(sc.nextInt());
            assertEquals("Jerry",a1);

        }
        @Test
    public void nothing()
        {
            TomJerry result = new TomJerry();
            String a3 = result.TomorJerry(78);
            assertEquals("OutOfRange",a3);
        }
}
