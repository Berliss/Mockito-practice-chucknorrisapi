package controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import entities.Joke;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import services.IJokeApiService;

@AllArgsConstructor
public class JokeController {
    private IJokeApiService service;
    @SneakyThrows
    public Joke getRandomJoke() {
        return new ObjectMapper().readValue(this.service.getRandomJoke(), Joke.class);
    }
}
