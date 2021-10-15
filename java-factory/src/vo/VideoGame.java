package vo;

public class VideoGame implements Electronic {
    @Override
    public void turnOn(){
        System.out.println("Turning videogame on.");
    }
}
