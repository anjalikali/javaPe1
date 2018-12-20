package com.stackroute.unittest.pe1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Scanner;

public class PalindromeTest {
    @Test
            public void PalindromesAndEvenSumGreaterThan25() {
        Palindrome pl = new Palindrome();
        String s1 = pl.PalindromeCheck(88488);
        assertEquals("Yes, is a palindrome sum of even is greater than  25", s1);
    }
    @Test
    public void PalindromesAndEvenSumLessThan25()
    {
        Palindrome pl = new Palindrome();

        String s2 = pl.PalindromeCheck(22422);
        assertEquals("Yes, is a palindrome sum of even is lesser than 25", s2);
    }
    @Test
    public void NotPalindrome()
    {
        Palindrome pl = new Palindrome();
        String s3=pl.PalindromeCheck(2323);
        assertEquals("NO, is not a palindrome",s3);
    }
}
