package za.ac.cput.factory;

import za.ac.cput.domain.StudentAddress;
import za.ac.cput.util.Helper;
import za.ac.cput.domain.Address;

public class StudentAddressFactory {


    public static StudentAddress createStudent(String studentId, Address address) throws IllegalAccessException {

        if (Helper.isNullorEmpty(studentId) ||Helper.isNullorEmpty(String.valueOf(address))){
            throw new IllegalAccessException("student and address are wrong");
        }

        return new StudentAddress.Builder()
                .setStudentId(studentId)
                .setAddress(address)
                .build();

    }



}
