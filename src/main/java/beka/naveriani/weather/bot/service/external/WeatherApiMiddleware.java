package beka.naveriani.weather.bot.service.external;

import si.mazi.rescu.ClientConfig;
import si.mazi.rescu.RestProxyFactory;

public class WeatherApiMiddleware {

    private WeatherApi api;


    public WeatherApiMiddleware(){
        ClientConfig config = new ClientConfig();
        api = RestProxyFactory.createProxy(WeatherApi.class, "http://localhost:8080/beka-naveriani-davaleba-1-1.0-SNAPSHOT", config);
    }

    public WeatherApi getApi(){
        return this.api;
    }
}
