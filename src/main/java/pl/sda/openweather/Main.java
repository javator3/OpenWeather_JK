package pl.sda.openweather;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.openweather.model.Weather;

import java.io.IOException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {
        // write your code here


        try {
            URL jsonURL = new URL("http://api.apixu.com/v1/current.json?key=0f207005eb8448f9a5f90638191002&q=Paris");
            ObjectMapper objectMapper = new ObjectMapper();
            Weather weather =  objectMapper.readValue(jsonURL, Weather.class);
            System.out.println(weather);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
