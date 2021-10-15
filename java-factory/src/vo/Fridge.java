package vo;

public class Fridge implements Electronic {
    @Override
    public void turnOn(){
        System.out.println("Turning fridge on.");
    }
}
