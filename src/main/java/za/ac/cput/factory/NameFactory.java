package za.ac.cput.factory;

import za.ac.cput.domain.Name;
import za.ac.cput.util.Helper;

public class NameFactory {

    //Factory method
    public static Name createName(String firstName, String middleName, String lastName){

        if (Helper.isNullorEmpty(firstName) || Helper.isNullorEmpty(lastName)){
            throw new IllegalArgumentException("firstName and lastName mandatory attributes.");
        }

        return new Name.Builder(firstName)
                .theirMiddleName(middleName)
                .theirLastName(lastName)
                .build();
    }
}
