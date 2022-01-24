package at.majohannsen.oo.observer;

public class Main {
    public static void main(String[] args) {
        Heat h1 = new Heat();
        Salt s1 = new Salt();

        TemperatureSensor ts = new TemperatureSensor();

        ts.addObserver(h1);
        ts.addObserver(s1);

        ts.alarm();
    }
}
