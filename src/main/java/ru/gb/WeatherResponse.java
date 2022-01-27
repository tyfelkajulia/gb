package ru.gb;

public class WeatherResponse {

    private String city;
    private String date;
    private String text;
    private int temperature;

    public WeatherResponse(String city, String date, String text, int temperature) {
        this.city = city;
        this.date = date;
        this.text = text;
        this.temperature = temperature;
    }

    public WeatherResponse(String city, String localdate, int temperature) {
        this.city = city;
        this.date = localdate;
        this.temperature = temperature;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "WeatherResponse{" +
                "city='" + city + '\'' +
                ", date='" + date + '\'' +
                ", text='" + text + '\'' +
                ", temperature=" + temperature +
                '}';
    }
}
