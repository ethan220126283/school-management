package za.ac.cput.factory;
/*
    Employee Factory
    Author: Lana Africa (216166640)
    Date: 11 June 2022
*/
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.Name;
import za.ac.cput.util.Helper;

public class EmployeeFactory {
    public static Employee build(String staffId, String email, Name name){

        if (Helper.isNullorEmpty(staffId) || Helper.isNullorEmpty(email)){
            throw new IllegalArgumentException("staffId, email and name");
        }
         //Helper.isNullorEmpty(name.getFirstName());

        return new Employee.Builder().StaffId(staffId).Email(email).Name(name).build();
    }
}
