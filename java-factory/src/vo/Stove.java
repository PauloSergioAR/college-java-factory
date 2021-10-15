package vo;

public class Stove implements Electronic {
    @Override
    public void turnOn() {
        System.out.println("Stove turning on");
    }
}
