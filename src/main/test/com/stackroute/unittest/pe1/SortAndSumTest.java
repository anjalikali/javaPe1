package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortAndSumTest {


        @Test
        public void CheckingForFalse() {
            SortAndSum s1 = new SortAndSum();

            String result = s1.SortedNumberEven("234534");

            assertEquals("544332Sum of even numbers :10False",result);
        }

        @Test
        public void CheckingForTrue() {
            SortAndSum s1 = new SortAndSum();

            String result = s1.SortedNumberEven("234534888");

            assertEquals("888544332Sum of even numbers :34True",result);
        }
    }

