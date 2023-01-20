package controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import services.IJokeApiService;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class JokeControllerTest {
    @Mock
    private IJokeApiService chuckNorrisJokesApiService;
    @InjectMocks
    private JokeController controller;
    private String jokeResponse;

    @BeforeEach
    void setUp() {
        jokeResponse = MockData.getJokes();
    }

    @Test
    @DisplayName("Test 'getRandomJoke', expected -> a Joke object from the response of the random api")
    void getRandomJoke() {
        //given
        when(chuckNorrisJokesApiService.getRandomJoke()).thenReturn(jokeResponse);

        //when
        var chuckNorrisJoke = controller.getRandomJoke();
        System.out.println(chuckNorrisJoke.getValue());

        //then
        assertNotNull(chuckNorrisJoke);
        assertNotNull(chuckNorrisJoke.getCategories());
        assertNotNull(chuckNorrisJoke.getCreatedAt());
        assertNotNull(chuckNorrisJoke.getIconURL());
        assertNotNull(chuckNorrisJoke.getId());
        assertNotNull(chuckNorrisJoke.getUpdatedAt());
        assertNotNull(chuckNorrisJoke.getUrl());
        assertNotNull(chuckNorrisJoke.getValue());
    }
}