package za.ac.cput.domain;

//import za.ac.cput.domain.Name;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {

    @Id
    private String studentId;

    private String email;
    private Name name;


    //Private Constructor
    private Student(Builder builder) {
        this.studentId = builder.studentId;
        this.email = builder.email;
        this.name = builder.name;
    }

    //Getters
    public String getStudentId() {
        return studentId;
    }
    public String getEmail() {
        return email;
    }
    public Name getName() {
        return name;
    }

    //Setters
    public void setStudentId(String studentId) {this.studentId = studentId;}
    public void setEmail(String email) {this.email = email;}
    public void setName(Name name) {this.name = name;}


    //Builder class
    public static class Builder{

        private String studentId;
        private String email;
        private Name name;

        public Builder() {}

        public Builder setStudentId(String studentId) {
            this.studentId = studentId;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setName(Name name) {
            this.name = name;
            return this;
        }


        public Student build(){
            return new Student(this);
        }

    }


    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
