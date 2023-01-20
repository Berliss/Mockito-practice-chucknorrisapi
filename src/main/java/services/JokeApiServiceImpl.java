package services;

import lombok.SneakyThrows;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class JokeApiServiceImpl implements IJokeApiService {
    @Override
    @SneakyThrows
    public String getRandomJoke() {
        var request = HttpRequest.newBuilder()
                .uri(new URI("https://api.chucknorris.io/jokes/random"))
                .GET()
                .build();

        var client = HttpClient.newBuilder().build();

        var httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());

        return httpResponse.body();
    }
}
