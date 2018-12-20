package com.stackroute.unittest.pe1;
import java.util.Scanner;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import  java.util.regex.*;

public class TomJerry {

    public String TomorJerry(int a) {
        String answer = "";


        if (a <= 30 && a >= 20) {

            if (a % 2 == 0)
                answer = "Jerry";
            else
                answer = "Tom";
        }
        else
            answer="OutOfRange";
        return answer;
    }
    }