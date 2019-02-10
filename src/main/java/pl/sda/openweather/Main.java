package pl.sda.openweather;

import pl.sda.openweather.model.WeatherService;


public class Main {

    public static void main(String[] args) {

        WeatherService weatherService = new WeatherService("http://api.apixu.com/v1/current.json", "0f207005eb8448f9a5f90638191002");

        weatherService.getCityWeather("ueyhaacc");

    }
}
