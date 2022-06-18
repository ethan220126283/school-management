package za.ac.cput.domain;

/**
 * Using Builder
 * Student Number - 206006330
 */
public class City {

    private String id;
    private String name;
    private Country country;

    //Private Constructors
   private City(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.country = builder.country;
    }

    //Setters


    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    //Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }
    //Builder Class
    public static class Builder {
        private String id;
        private String name;
        private Country country;

        public Builder(String id) {
            this.id = id;
        }
        public Builder theirName(String name) {
            this.name = name;
            return this;
        }

        public Builder theirCountry(Country country) {
            this.name = name;
            return this;
        }

        //This is optional
        public Builder copy(City city) {
            this.id = city.id;
            this.name = city.name;
            this.country = city.country;
            return this;
        }

        public City build() {
            return new City(this);
        }

    }

        @Override
        public String toString() {
            return "City{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", country=" + country +
                    '}';


    }

}
