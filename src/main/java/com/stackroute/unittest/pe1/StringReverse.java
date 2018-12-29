package com.stackroute.unittest.pe1;

public class StringReverse {

    /*Write a program to reverse any string without using String Buffer.*/

        public String revStr(String str)
        {
            int i;
            char tempArray[] = str.toCharArray();
            String rev = "";
            for (i = tempArray.length - 1; i >= 0; i--)
            {
                rev = rev + (tempArray[i]);
            }
            return rev;
        }

    }
