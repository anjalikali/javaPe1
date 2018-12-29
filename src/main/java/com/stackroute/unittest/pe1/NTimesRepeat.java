package com.stackroute.unittest.pe1;

public class NTimesRepeat {

        public String repeateStr(String str, int num)
        {
            int i;
            String str1 = str.substring(str.length()-num);
            String finalStr = "";
            for(i=0;i<num;i++)
            {
                finalStr = finalStr + str1;
            }
            str = str + finalStr;
            System.out.println(str);
            return str;
        }

    }
