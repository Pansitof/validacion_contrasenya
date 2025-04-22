package org.example.application.usercase;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordVerification2Should {
    private PasswordVerification passwordVerification = new PasswordVerification();

    @Test
    public void failWithPasswordNotLongEnough(){
        String password = "Aa1";
        assertFalse(passwordVerification.verifyPasswordVersion2(password));
    }
    @Test
    public void failWithNoUpperCase(){
        String password = "aaaaa8";
        assertFalse(passwordVerification.verifyPasswordVersion2(password));
    }
    @Test
    public void failWithNoLowerCase(){
        String password = "AAAAA8";
        assertFalse(passwordVerification.verifyPasswordVersion2(password));
    }
    @Test
    public void failWithNoNumber(){
        String password = "aaaaaA";
        assertFalse(passwordVerification.verifyPasswordVersion2(password));
    }
    @Test
    public void verifyGoodPassword(){
        String password = "AAaaa8";
        assertTrue(passwordVerification.verifyPasswordVersion2(password));
    }
}
