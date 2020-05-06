package beka.naveriani.weather.bot.service.external;

import beka.naveriani.weather.bot.models.Weather;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("api/weather")
public interface WeatherApi {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    List<Weather> getAllWeather();


    @GET
    @Path("{cityName}")
    @Produces(MediaType.APPLICATION_JSON)
    Weather getWeatherByCity(@PathParam("cityName") String cityName);
}
