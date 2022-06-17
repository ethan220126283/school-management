package za.ac.cput.factory;

import za.ac.cput.domain.Student;
import za.ac.cput.util.Helper;
import za.ac.cput.domain.Name;

public class StudentFactory {


        public static Student createStudent(String email, Name name) {

                if  ( Helper.isNullorEmpty(email)|| Helper.isNullorEmpty(String.valueOf(name))){
                        throw new IllegalArgumentException("studentId, email and name");
                }

        return new Student.Builder()
                .setEmail(email)
                .setName(name)
                .build();
        }


}
