package Task2;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

 class Dignitary {

    String name;
    List<String> knownFor;
    List<Award> awards;

    @JsonCreator
    private Dignitary(
        @JsonProperty("name") String name, 
        @JsonProperty("knownFor") List<String> knownFor, 
        @JsonProperty("awards") List<Award> awards) {
        this.name = name;
        this.knownFor = knownFor;
        this.awards = awards;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append("\n").append("Known For: \n");
        for (String known : knownFor) {
            sb.append("\t").append(known).append("\n");
        }
        sb.append("Awards: \n");
        for (Award award : awards) {
            sb.append("\t").append(award).append("\n");
        }
        return sb.toString();
    }
}