package za.ac.cput.factory;

/* Student#: 220126283
*  Name: Ethan Christopher Swart
*  Subject: ADP3
* */

import za.ac.cput.domain.Name;
import za.ac.cput.util.Helper;

public class NameFactory {

    //Factory method
    public static Name createName(String firstName, String middleName, String lastName){

        //Check for null
        if (Helper.isNullorEmpty(firstName) || Helper.isNullorEmpty(lastName)){
            throw new IllegalArgumentException("firstName and lastName mandatory attributes.");
        }

        //Return of Name entity
        return new Name.Builder(firstName)
                .theirMiddleName(middleName)
                .theirLastName(lastName)
                .build();
    }
}
