package za.ac.cput.domain;

public class StudentAddress {

    private String studentId;

    private Address address;

    private StudentAddress(Builder builder){
        this.studentId = builder.studentId;
        this.address = builder.address;

    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static class Builder{

        private String studentId;

        private Address address;

        public Builder(){

        }

        public Builder setStudentId(String studentId) {
            this.studentId = studentId;
            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;

        }
        public StudentAddress build(){
            return new StudentAddress(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "studentId='" + studentId + '\'' +
                    ", address=" + address +
                    '}';
        }
    }
}
