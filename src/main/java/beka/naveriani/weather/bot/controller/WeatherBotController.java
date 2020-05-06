package beka.naveriani.weather.bot.controller;

import beka.naveriani.weather.bot.models.Weather;
import beka.naveriani.weather.bot.service.WeatherService;
import beka.naveriani.weather.bot.service.impl.WeatherServiceImpl;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.ServerEndpoint;
import java.util.List;

@ServerEndpoint("/weather")
public class WeatherBotController {

    WeatherService weatherService = WeatherServiceImpl.getInstance();

    @OnOpen
    public void handleOpen() {
        System.out.println("Connected ...");
    }

    @OnMessage
    public String handleMessage(String message) {
        if (message.equalsIgnoreCase("all")){
            List<Weather> allWeather = weatherService.getAllWeather();
            StringBuilder listToArray = new StringBuilder("[");
            for (Weather weather : allWeather) {
                listToArray.append(weather.toString()).append(",");
            }
            listToArray.append("]");
            return listToArray.toString();
        } else {
            return weatherService.getWeatherByCity(message).toString();
        }
    }

    @OnClose
    public void handleClose() {
        System.out.println("End Connection ...");
    }

    @OnError
    public void handleError(Throwable t) {
        t.printStackTrace();
    }

}
