package org.example.application.usercase;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordVerification1Should {
    private PasswordVerification passwordVerification = new PasswordVerification();

    @Test
    public void failWithPasswordNotLongEnough(){
        String password = "Aa_1";
        assertFalse(passwordVerification.verifyPasswordVersion1(password));
    }
    @Test
    public void failWithNoUpperCase(){
        String password = "aaaaaa_8";
        assertFalse(passwordVerification.verifyPasswordVersion1(password));
    }
    @Test
    public void failWithNoLowerCase(){
        String password = "AAAAAA_8";
        assertFalse(passwordVerification.verifyPasswordVersion1(password));
    }
    @Test
    public void failWithNoNumber(){
        String password = "AAAAAa_a";
        assertFalse(passwordVerification.verifyPasswordVersion1(password));
    }
    @Test
    public void failWithNo_(){
        String password = "AAAAAa88";
        assertFalse(passwordVerification.verifyPasswordVersion1(password));
    }
    @Test
    public void verifyGoodPassword(){
        String password = "AAAAAa_8";
        assertTrue(passwordVerification.verifyPasswordVersion1(password));
    }
}
