package za.ac.cput.domain;

//import za.ac.cput.domain.Name;

public class Student {

    private String studentId;

    private String email;

    private Name name;



    private Student(Builder builder) {
        this.studentId = builder.studentId;
        this.email = builder.email;
        this.name = builder.build().name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }


    public static class Builder{

        private String studentId;

        private String email;

        private Name name;

        public Builder() {

        }


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
