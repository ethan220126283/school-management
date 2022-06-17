package za.ac.cput.domain;
/*
        Student: Darryll Merkeur (220253595)
        Date: 18 June 2022
*/
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;
@Entity
@IdClass
(Country.CountryId.class)
public class Country implements Serializable{
    @NotNull
    @Id
    public String countryId;
    @NotNull
    public String countryName;

    protected Country(){}

    public Country(Builder builder) {
        this.countryId = builder.countryId;
        this.countryName = builder.countryName;
    }
    public String getCountryId() {
        return countryId;
    }
    public String getCountryName() {
        return countryName;
    }

    public static class Builder {
        public String countryId;
        public String countryName;

        public Builder countryId(String countryId) {
            this.countryId = countryId;
            return this;
        }

        public Builder countryName(String countryName) {
            this.countryName = countryName;
            return this;
        }

        public Builder copy(Country country) {
            this.countryId = country.countryId;
            this.countryName= country.countryName;
            return this;

        }
        public Country build(){ return new Country(this);}}

    public static class CountryId implements Serializable
    {
        public String countryId;
        public CountryId(String countryId)
        {this.countryId=countryId;}
        protected CountryId(){}
        public String getCountryId(){return countryId;}
    }
    @Override
    public boolean equals(Object a)
    {
        if(this==a) return true;
        if(a==null || getClass()!=a.getClass()) return false;
        Country country=(Country) a;
        return countryId.equals(country.countryId);
    }
    @Override
    public int hashCode()
    {return Objects.hash(countryId);}

    @Override
    public String toString() {
        return "Country{" +
                "countryId='" + countryId + '\'' +
                ", countryName='" + countryName + '\'' +
                '}';
    }
}
