import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HomeWorkApp {

    public static void main(String[] args) {

        URL geekbrainsURL;

        try {
            geekbrainsURL = new URL("https://goweather.herokuapp.com/weather/St%20Petersburg");
            HttpURLConnection urlConnection = (HttpURLConnection) geekbrainsURL.openConnection();

            System.out.println("Метод запроса:" + urlConnection.getRequestMethod());
            System.out.println("Код ответа:" + urlConnection.getResponseCode());
            System.out.println("Ответное сообщение:" + urlConnection.getResponseMessage());

            BufferedReader br = new BufferedReader(new InputStreamReader((urlConnection.getInputStream())));
            StringBuilder sb = new StringBuilder();
            String output;
            while ((output = br.readLine()) != null) {
                sb.append(output);
            }
            System.out.println("Погода в Питере" + sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }



    }

}



