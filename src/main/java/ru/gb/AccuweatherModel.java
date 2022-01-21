package ru.gb;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Iterator;

public class AccuweatherModel {
    //http://dataservice.accuweather.com/forecasts/v1/daily/1day/28573
    private static final String PROTOKOL = "https";
    private static final String BASE_HOST = "dataservice.accuweather.com";
    private static final String FORECASTS = "forecasts";
    private static final String VERSION = "v1";
    private static final String DAILY = "daily";
    private static final String ONE_DAY = "5day";
    private static final String API_KEY = "pEBX3mGWSXqQr4Ps9oCHLw35UZDcAkqV";
    private static final String API_KEY_QUERY_PARAM = "apikey";
    private static final String LOCATIONS = "locations";
    private static final String CITIES = "cities";
    private static final String AUTOCOMPLETE = "autocomplete";
    private static final String CITY_CODE = "28573";

    private static final OkHttpClient okHttpClient = new OkHttpClient();
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public void getWeather(String city, int period) throws IOException {
        String foundCity = detectCityKey(city);
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme(PROTOKOL)
                .host(BASE_HOST)
                .addPathSegment(FORECASTS)
                .addPathSegment(VERSION)
                .addPathSegment(DAILY)
                .addPathSegment(ONE_DAY)
                .addPathSegment(foundCity)
                .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                .build();

        Request request = new Request.Builder()
                .url(httpUrl)
                .build();

        Response oneDayForecastResponse = okHttpClient.newCall(request).execute();
        String weatherResponse = oneDayForecastResponse.body().string();

         Iterator<JsonNode> iterator = objectMapper.readTree(weatherResponse).get("DailyForecasts").iterator();
         int index = 0;
         while(iterator.hasNext() || index <= period){
             JsonNode item = iterator.next();
             System.out.println("В Городе: "+ city + " на дату: " + item.get("Date") + " ожидается " + item.get("Day").get("IconPhrase") + "с температурой " + item.get("Temperature").get("Maximum").get("Value"));
             index++;
         }
    }

    private String detectCityKey(String selectCity) throws IOException {
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme(PROTOKOL)
                .host(BASE_HOST)
                .addPathSegment(LOCATIONS)
                .addPathSegment(VERSION)
                .addPathSegment(CITIES)
                .addPathSegment(AUTOCOMPLETE)
                .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                .addQueryParameter("q", selectCity)
                .build();

        Request request = new Request.Builder()
                .url(httpUrl)
                .get()
                .addHeader("accept", "application/json")
                .build();

        Response response = okHttpClient.newCall(request).execute();
        String responseString = response.body().string();

        String cityKey = objectMapper.readTree(responseString).get(0).at("/Key").asText();
        return cityKey;
    }

}