package com.stackroute.unittest.pe1;

public class SumOfInteger {

        public int checkSum(String str)
        {
            String[] arrOfStr = str.split(" ");
            int sum = 0;
            String s;
            for (String a : arrOfStr)
            {
                if(a.matches("[0-9]+"))
                {
                    sum = sum + Integer.parseInt(a);
                }
                else{
                    return 0;
                }
            }
            return sum;
        }

}
