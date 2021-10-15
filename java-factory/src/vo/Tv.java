package vo;

public class Tv implements  Electronic {
    @Override
    public void turnOn(){
        System.out.println("Turning tv on.");
    }
}
