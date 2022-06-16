package za.ac.cput.util;

import org.apache.commons.validator.EmailValidator;

public class Helper {

    public static boolean isNullorEmpty(String s){
        return (s == null || s.equals ("") || s.isEmpty()|| s.equalsIgnoreCase("null"));
    }

    public static boolean isValidEmail(String email){
        EmailValidator ev = EmailValidator.getInstance();
        return ev.isValid(email);
    }

}
