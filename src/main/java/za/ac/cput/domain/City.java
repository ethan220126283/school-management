package za.ac.cput.domain;

/**
 * Using Builder
 * Student Number - 206006330
 */

public class City {

    private String id;
    private String name;

    //Private Constructors
    private City(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
    }
    private City(){

    }

    //Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    //Setters

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    //Builder Class
    public static class Builder{
        private String id;
        private String name;

        public Builder(){

        };

        public Builder setId(String id){
            this.id = id;
            return this;
        }
        public Builder setName(String name){
            this.name = name;
            return this;
        }
        //This is optional
        public Builder copy(City city){
            this.id = city.name;
            this.name = city.name;
            return this;
        }
        public City builder(){
            return new City(this);
        }
    }

}
