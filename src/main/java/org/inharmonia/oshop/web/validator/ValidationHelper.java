package org.inharmonia.oshop.web.validator;

public class ValidationHelper {

    public static boolean isValidEmail(String email) {
        return email.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
    }

}
