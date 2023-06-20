import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherAPI {

    public static void main(String[] args) {
        String apiKey = "098d99693b60efe4bda03c2aeffb66d9"; // Insira sua chave de API do OpenWeatherMap aqui
        String city = "Paraíba"; // Insira o nome da cidade para a qual deseja obter informações climáticas

        try {
            URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            StringBuilder resposta;
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                String linha;
                resposta = new StringBuilder();
                while ((linha = reader.readLine()) != null) {
                    resposta.append(linha);
                }
            }

            System.out.println(resposta.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
