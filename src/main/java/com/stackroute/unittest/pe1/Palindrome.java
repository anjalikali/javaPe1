package com.stackroute.unittest.pe1;

public class Palindrome {

    public String PalindromeCheck(int a) {
        int ev_sum = 0;
        int z1 = a;
        int reversed = 0;
        String answer = "";

        while (a != 0) {
            if ((a % 10) % 2 == 0) {
                ev_sum = ev_sum + (a % 10);
            }
            reversed = (reversed * 10) + (a % 10);
            a = a / 10;
        }

        if (z1 == reversed) {
            answer = "Yes, is a palindrome";
            if (ev_sum > 25)
                answer = answer + " sum of even is greater than  25";
            else
                answer = answer + " sum of even is lesser than 25";
        } else
            answer = "NO, is not a palindrome";
        return answer;
    }
}

