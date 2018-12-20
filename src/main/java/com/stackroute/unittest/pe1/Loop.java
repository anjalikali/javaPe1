package com.stackroute.unittest.pe1;

public class Loop {

    public String PrintLoop(int a) {
        String st = "";
        if(a<=0)
        {
            st = "Negative Number";
        }
        else {
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= i; j++) {
                    st = st + Integer.toString(i);
                }
            }
        }
        return st;
    }
}