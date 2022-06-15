package za.ac.cput.util;

//import org.apache.commons.validator.EmailValidator;

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

}
