package za.ac.cput.domain;

/* Student#: 220126283
 *  Name: Ethan Christopher Swart
 *  Subject: ADP3
 * */


import javax.persistence.Embeddable;
import java.util.Objects;


public class Name  {

    private String firstName;
    private String middleName;
    private String lastName;


    //Private Constructors
    private Name(Builder builder) {
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
    }


    //Getters
    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    //Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Builder Class
    public static class Builder{

        private String firstName;
        private String middleName;
        private String lastName;

        public Builder(String firstName) {
            this.firstName = firstName;
        };


        public Builder theirMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder theirLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder copy(Name name){
            this.firstName = name.firstName;
            this.middleName = name.middleName;
            this.lastName = name.lastName;
            return this;
        }

        public Name build(){
            return new Name(this);
        }
    }

    //toString method
    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name that = (Name) o;
        return firstName.equals(that.firstName)
                && middleName.equals(that.middleName)
                && lastName.equals(that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName,middleName,lastName);
    }
}
