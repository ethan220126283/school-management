package za.ac.cput.domain;
/*
    Entity for Employee
    Author: Lana Africa (216166640)

*/
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Employee implements Serializable {
    @Id
    @NotNull
    private String staffId;
    @NotNull
    private String email;
    @Embedded
    @NotNull
    private Name name;

    protected Employee(){}

    private Employee(Builder builder){
        this.staffId = builder.staffId;
        this.email = builder.email;
        this.name = builder.name;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getEmail() {
        return email;
    }

    public Name getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "staffId='" + staffId + '\'' +
                ", email='" + email + '\'' +
                ", name=" + name +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return staffId.equals(employee.staffId) && Objects.equals(email, employee.email) && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(staffId, email, name);
    }

    public static class Builder{

        private String staffId;
        private String email;
        private Name name;

        public Builder StaffId(String staffId) {
            this.staffId = staffId;
            return this;
        }

        public Builder Email(String email) {
            this.email=email;
            return this;
        }

        public Builder Name(Name name) {
            this.name = name;
            return this;
        }
        public Builder copy(Employee employee){
            this.staffId=employee.staffId;
            this.email=employee.email;
            this.name=employee.name;
            return this;
        }
        public Employee build(){
            return new Employee(this);
        }
    }
}