package za.ac.cput.factory;
/*
    Employee Address Factory
    Author: Lana Africa (216166640)
    Date: 11 June 2022
*/
import za.ac.cput.domain.Address;
import za.ac.cput.domain.EmployeeAddress;
import za.ac.cput.util.Helper;

public class EmployeeAddressFactory {
    public static EmployeeAddress build(String staffId, Address address){
        if (Helper.isNullorEmpty(staffId)) {
            //Helper.isNullorEmpty(address);
            throw new IllegalArgumentException("staffID and address");
        }
        return new EmployeeAddress.Builder().StaffId(staffId).Address(address).build();
    }

    public static EmployeeAddress.EmployeeAddressId buildId(EmployeeAddress employeeAddress){
        return new EmployeeAddress.EmployeeAddressId(employeeAddress.getStaffId(),
                employeeAddress.getAddress());
    }
}