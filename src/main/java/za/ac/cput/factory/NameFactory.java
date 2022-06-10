package za.ac.cput.factory;

import za.ac.cput.domain.Name;
import za.ac.cput.util.Helper;

public class NameFactory {

    //Factory method
    public static Name createName(String firstName, String middleName, String lastName){

        if (Helper.isNullorEmpty(firstName) || Helper.isNullorEmpty(lastName)){
            return null;
        }

        return new Name.Builder()
                .theirFirstName(firstName)
                .theirMiddleName(middleName)
                .theirLastName(lastName)
                .build();
    }
}
