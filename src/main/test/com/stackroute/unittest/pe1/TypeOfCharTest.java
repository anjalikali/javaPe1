package com.stackroute.unittest.pe1;
import org.junit.Test;
import static org.junit.Assert.*;

public class TypeOfCharTest {

    @Test

    public void CharCap(){
        TypeOfChar ch = new TypeOfChar();
        String s1 = ch.CharacterCheck('A');
        assertEquals("Captital",s1);
    }

    @Test
    public void Charsnall(){
        TypeOfChar ch = new TypeOfChar();
        String s1 = ch.CharacterCheck('a');
        assertEquals("Small",s1);
    }

@Test
    public void CharDigit(){
        TypeOfChar ch = new TypeOfChar();
        String s1 = ch.CharacterCheck('h');
        assertEquals("Digit",s1);
    }

@Test
    public void Charsym(){
        TypeOfChar ch = new TypeOfChar();
        String s1 = ch.CharacterCheck('@');
        assertEquals("Spacial Symbol",s1);
    }


}
