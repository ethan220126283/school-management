package za.ac.cput.util;

//import org.apache.commons.validator.EmailValidator;

import org.apache.commons.validator.routines.EmailValidator;

public class Helper {

    //Check for null or empty field
    public static boolean isNullorEmpty(String s){
        return (s == null || s.equals ("") || s.isEmpty()|| s.equalsIgnoreCase("null"));
    }

    /* TODO: Review email validation
    public static boolean isValidEmail(String email){
        EmailValidator ev = EmailValidator.getInstance();
        return ev.isValid(email);
    }*/
    public static void emailValid(String email){
        EmailValidator emailValidator = EmailValidator.getInstance();
        if (!emailValidator.isValid(email)) throw new IllegalArgumentException("Email is not valid");
    }
    public static void checkObjectNull(String objectName, Object objectValue){
        if (objectValue == null)
            throw new IllegalArgumentException(String.format("Invalid value for param: %s", objectName));
    }

}
