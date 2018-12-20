package com.stackroute.unittest.pe1;

public class randomGuess {

    public String randomguessnumber(int original, int guess )
    {
        String str = "";
        if(guess>=100 || guess<=0)
            str = "out of limit";
        else if(guess==original)
            str="success";
        else
            str="failed";

        return str;
    }

}
