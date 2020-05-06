package beka.naveriani.weather.bot.models;

public class Weather {

    public enum DirectionType{
        NORTH,
        SOUTH,
        EAST,
        WEST
    }

    private String cityName;

    private String pressure;

    private String temperature;

    private String humidity;

    private String windSpeed;

    private DirectionType windDirection;

    public Weather(){}

    public Weather(String cityName, String pressure, String temperature, String humidity, String windSpeed, DirectionType windDirection){
        this.cityName = cityName;
        this.pressure = pressure;
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.windDirection = windDirection;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getPressure() {
        return pressure;
    }

    public String getHumidity() {
        return humidity;
    }

    public DirectionType getWindDirection() {
        return windDirection;
    }

    public String getCityName() {
        return cityName;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setWindDirection(DirectionType windDirection) {
        this.windDirection = windDirection;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }


    public String toString(){
        StringBuilder stringBuilder = new StringBuilder("{");

        stringBuilder.append("\"cityName\": ").append(cityName).append(",");
        stringBuilder.append("\"pressure\": ").append(pressure).append(",");
        stringBuilder.append("\"temperature\": ").append(temperature).append(",");
        stringBuilder.append("\"humidity\": ").append(humidity).append(",");
        stringBuilder.append("\"windSpeed\": ").append(windSpeed).append(",");
        stringBuilder.append("\"windDirection\": ").append(windDirection).append("}");

        return stringBuilder.toString();
    }
}
