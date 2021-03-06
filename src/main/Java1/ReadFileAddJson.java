package src.main.Java1;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * Created by byang on 2018-09-19.
 */

public class ReadFileAddJson {

    public static void main(String[] args) {

        try {
            ObjectMapper mapper = new ObjectMapper();
           JsonNode root = mapper.readTree(new File("./src/main/resources/temp6.json"));

            String resultOriginal = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(root);
            System.out.println("Before Update " + resultOriginal);

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}