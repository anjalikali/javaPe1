package com.stackroute.unittest.pe1;

public class TypeOfChar {
        public String CharacterCheck(char input) {
            String answer = "";
            if (input >= 65 && input <= 90)
                answer = "Captital";
            else if (input >= 97 && input <= 122)
                answer = "Small";
            else if (input >= 48 && input <= 57)
                answer = "Digit";
            else if (((input > 0 && input <= 47) || (input >= 58 && input <= 64) ||
                    (input >= 91 && input <= 96) || (input >= 123 && input <= 127)))
                answer = "Spacial Symbol";

            return answer;
        }
}




