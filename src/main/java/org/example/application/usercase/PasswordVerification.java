package org.example.application.usercase;

import java.util.regex.Pattern;

public class PasswordVerification {

    public PasswordVerification() {
    }

    //<>
    public boolean verifyPasswordVersion1(String password) {
        return password.length() >= 8 &&
                findUpperCase(password) &&
                findLowerCase(password) &&
                findNumber(password) &&
                find_(password);
    }

    public boolean verifyPasswordVersion2(String password) {
        return password.length() >= 6 &&
                findUpperCase(password) &&
                findLowerCase(password) &&
                findNumber(password);
    }

    public boolean verifyPasswordVersion3(String password) {
        return password.length() >= 16 &&
                findUpperCase(password) &&
                findLowerCase(password) &&
                find_(password);
    }

    public boolean verifyPasswordVersion4(String password) {
        int pruebasSuperadas = 0;
        if (password.length() >= 8) {pruebasSuperadas++;}
        if (findUpperCase(password)) {pruebasSuperadas++;}
        if (findNumber(password)) {pruebasSuperadas++;}
        if (find_(password)) {pruebasSuperadas++;}

        return pruebasSuperadas >= 3;
    }

    private boolean findUpperCase(String password) {
        Pattern pattern = Pattern.compile("\\p{Lu}");
        return pattern.matcher(password).find();
    }

    private boolean findLowerCase(String password) {
        Pattern pattern = Pattern.compile("\\p{Ll}");
        return pattern.matcher(password).find();
    }

    private boolean findNumber(String password) {
        Pattern pattern = Pattern.compile("[0-9]");
        return pattern.matcher(password).find();
    }

    private boolean find_(String password) {
        Pattern pattern = Pattern.compile("[_]");
        return pattern.matcher(password).find();
    }
}
