package za.ac.cput.util;

/* Student#: 220126283
 *  Name: Ethan Christopher Swart
 *  Subject: ADP3
 * */

public class Helper {

    //Check for null or empty field
    public static boolean isNullorEmpty(String s){
        return (s == null || s.equals ("") || s.isEmpty()|| s.equalsIgnoreCase("null"));
    }
}
