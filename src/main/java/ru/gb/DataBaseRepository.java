package ru.gb;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBaseRepository {
    public static String DB_PATH = "jdbc:sqlite:sample.db";
    private String insertWeather = "insert into weather (city, localdate, temperature) values (?, ?, ?)";
    private String getWeather = "select * from weather";

    static{
        try (Connection connection = DriverManager.getConnection(DB_PATH)) {
            Statement statement = connection.createStatement();
            statement.executeUpdate("drop table if exists weather");
            statement.executeUpdate("create table weather (id integer, city string, localdate string, temperature integer)");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public boolean saveWeatherToDataBase(WeatherResponse weather) throws SQLException {
        try (Connection connection = DriverManager.getConnection(DB_PATH)) {
            PreparedStatement saveWeather = connection.prepareStatement(insertWeather);
            saveWeather.setString(1, weather.getCity());
            saveWeather.setString(2, weather.getDate());
            saveWeather.setDouble(3, weather.getTemperature());
            return saveWeather.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        throw new SQLException("Сохранение погоды в базу данных не выполнено!");
    }

    public List<WeatherResponse> getSavedToDBWeather() {
        List<WeatherResponse> weathers = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(DB_PATH)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(getWeather);
            System.out.println("Response from DB:");
            while (resultSet.next()) {
                System.out.print(resultSet.getString("city") + " ");
                System.out.print(resultSet.getString("localdate") + " ");
                System.out.println(resultSet.getDouble("temperature") + " ");
                weathers.add(new WeatherResponse(resultSet.getString("city"),
                        resultSet.getString("localdate"),
                        resultSet.getInt("temperature")));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return weathers;
    }

}
