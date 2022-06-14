package za.ac.cput.factory;

import za.ac.cput.domain.Student;
import za.ac.cput.util.Helper;
import za.ac.cput.domain.Name;

public class StudentFactory {


        public static Student createStudent(String studentId, String email, Name name) {

                if (Helper.isNullorEmpty(studentId) ||Helper.isNullorEmpty(email)|| Helper.isNullorEmpty(String.valueOf(name))){
                        return null;
                }

        return new Student.Builder()
                .setStudentId(studentId)
                .setEmail(email)
                .setName(name)
                .build();


        }


}
