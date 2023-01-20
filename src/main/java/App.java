import controllers.JokeController;
import services.JokeApiServiceImpl;

import java.io.IOException;
import java.net.URISyntaxException;


public class App {

    public App(){
        var service = new JokeApiServiceImpl();
        var controller = new JokeController(service);
        var randomJoke = controller.getRandomJoke();
        System.out.println(randomJoke);
    }
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        new App();
    }
}
