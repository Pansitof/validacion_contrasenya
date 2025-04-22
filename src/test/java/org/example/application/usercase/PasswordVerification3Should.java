package org.example.application.usercase;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordVerification3Should {
    private PasswordVerification passwordVerification = new PasswordVerification();

    @Test
    public void failWithPasswordNotLongEnough(){
        String password = "Aa_";
        assertFalse(passwordVerification.verifyPasswordVersion3(password));
    }
    @Test
    public void failWithNoUpperCase(){
        String password = "aaaaaaaaaaaaaaa_";
        assertFalse(passwordVerification.verifyPasswordVersion3(password));
    }
    @Test
    public void failWithNoLowerCase(){
        String password = "AAAAAAAAAAAAAAA_";
        assertFalse(passwordVerification.verifyPasswordVersion3(password));
    }
    @Test
    public void failWithNo_(){
        String password = "AAAAAAAAAAAAAAAa";
        assertFalse(passwordVerification.verifyPasswordVersion3(password));
    }
    @Test
    public void verifyGoodPassword(){
        String password = "AAAAAaaAAAAAAAA_";
        assertTrue(passwordVerification.verifyPasswordVersion3(password));
    }
}
