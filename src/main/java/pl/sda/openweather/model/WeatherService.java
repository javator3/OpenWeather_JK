package pl.sda.openweather.model;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class WeatherService {

    Weather weather = null;
    private String url;
    private String apiKey;
    private String finalURL;

    public WeatherService(String url, String apiKey) {
        this.url = url;
        this.apiKey = apiKey;
        this.finalURL = url + "?key=" + apiKey + "&q=";
    }


    public void getCityWeather(String city) {
        finalURL = finalURL + city;
        System.out.println(finalURL);
        try {
            jasonDownloading();
            showTemp();
            showWeather();
        } catch (IOException e) {
            System.out.println("Nie ma takiej miejscowosci: " + city);;
        }

    }

    public void jasonDownloading() throws IOException {

            URL jsonURL = new URL(finalURL);
            ObjectMapper objectMapper = new ObjectMapper();
            weather = objectMapper.readValue(jsonURL, Weather.class);

    }

    public void showTemp(){
        int temperature = weather.getCurrent().getTemp_c();
        System.out.println("Temperature: " + temperature);
    }

    public void showWeather(){
        System.out.println(weather);
    }

}
