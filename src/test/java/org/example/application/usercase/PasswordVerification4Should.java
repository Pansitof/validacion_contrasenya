package org.example.application.usercase;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordVerification4Should {
    private PasswordVerification passwordVerification = new PasswordVerification();

    @Test
    public void failIfTwoFails(){
        String password = "aaaa88";
        assertFalse(passwordVerification.verifyPasswordVersion4(password));
    }

    @Test
    public void passWithPasswordNotLongEnough(){
        String password = "A_1";
        assertTrue(passwordVerification.verifyPasswordVersion4(password));
    }
    @Test
    public void passWithNoUpperCase(){
        String password = "aaaaaa_8";
        assertTrue(passwordVerification.verifyPasswordVersion4(password));
    }
    @Test
    public void passWithNoNumber(){
        String password = "AAAAAa_a";
        assertTrue(passwordVerification.verifyPasswordVersion4(password));
    }
    @Test
    public void passWithNo_(){
        String password = "AAAAAa88";
        assertTrue(passwordVerification.verifyPasswordVersion4(password));
    }
    @Test
    public void verifyGoodPassword(){
        String password = "AAAAAa_8";
        assertTrue(passwordVerification.verifyPasswordVersion4(password));
    }
}
