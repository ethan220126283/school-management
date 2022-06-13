package za.ac.cput.factory;
/*
        Student: Darryll Merkeur (220253595)
        Date: 18 June 2022
*/
import za.ac.cput.domain.Country;
import za.ac.cput.util.Helper;

public class CountryFactory {
    public static Country createCountry(String name, String id) {

     /* if (Helper.isNullorEmpty(id)){
            return null;
        }
        if(Helper.isNullorEmpty(name)){
            return null;

      */
        if (Helper.isNullorEmpty(name) || Helper.isNullorEmpty(id)) {
           throw new IllegalArgumentException(" ");

        }
        //if(Helper.isNullorEmpty("")){
          //  return null;
        //}

            return new Country.Builder()
                    .setId(id)
                    .setName(name)
                    .build();

        }
    }

