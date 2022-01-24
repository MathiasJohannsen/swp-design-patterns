package at.majohannsen.oo.observer;

public class Heat implements Observer{
    public void alarm() {
        System.out.println("Heating alarm");
    }

    public void doHeating() {
        System.out.println("I am heating");
    }
}
