import ru.gb.AccuweatherModel;

import java.util.Scanner;

public class HomeWorkApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Weather App!");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Введите название города ");
        String selectedCity = keyboard.nextLine();
        System.out.println("Введите 1 для получения погоды на сегодня;" +
                "Введите 5 для прогноза на 5 дней; Введите 2 для получения данных из базы; Для выхода введите 0:");
        int period = keyboard.nextInt();
        if(period < 0 || period > 5){
            System.out.println("Введены некоректные данные");
        }else if(period == 0) {
            System.out.println("Программа завершена");
            System.exit(0);
        }
        System.out.println("Выбран город: " + selectedCity);
        System.out.println("Период:" + period);
        System.out.println("-----------------------------");

        try {
            AccuweatherModel acWeather = new AccuweatherModel();
            acWeather.getWeather(selectedCity, period);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}



