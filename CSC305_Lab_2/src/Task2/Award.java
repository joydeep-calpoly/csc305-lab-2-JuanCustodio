package Task2;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

 class Award {

    String name;
    int year;

    @JsonCreator
    private Award(
        @JsonProperty("name") String name, 
        @JsonProperty("year") int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return name + ", " + year;
    }
}
