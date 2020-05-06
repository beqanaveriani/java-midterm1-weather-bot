package beka.naveriani.weather.bot.service.impl;

import beka.naveriani.weather.bot.models.Weather;
import beka.naveriani.weather.bot.service.WeatherService;
import beka.naveriani.weather.bot.service.external.WeatherApi;
import beka.naveriani.weather.bot.service.external.WeatherApiMiddleware;

import java.util.List;

public class WeatherServiceImpl implements WeatherService {

    private static WeatherService INSTANCE;

    private  WeatherApi weatherApi = new WeatherApiMiddleware().getApi();


    public static WeatherService getInstance(){
        if (INSTANCE == null){
            INSTANCE = new WeatherServiceImpl();
        }
        return INSTANCE;
    }

    @Override
    public List<Weather> getAllWeather() {
        return weatherApi.getAllWeather();
    }

    @Override
    public Weather getWeatherByCity(String cityName) {
        return weatherApi.getWeatherByCity(cityName);
    }
}
