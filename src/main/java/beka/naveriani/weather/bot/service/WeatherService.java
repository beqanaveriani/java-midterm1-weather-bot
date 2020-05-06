package beka.naveriani.weather.bot.service;

import beka.naveriani.weather.bot.models.Weather;

import java.util.List;

public interface WeatherService {

    List<Weather> getAllWeather();

    Weather getWeatherByCity(String cityName);

}
