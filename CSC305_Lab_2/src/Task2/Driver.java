package Task2;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();

            Dignitary dignitary = objectMapper.readValue(new File("input1.json"), Dignitary.class);

            System.out.println(dignitary);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
