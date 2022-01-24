package at.majohannsen.oo.observer;

import java.util.ArrayList;
import java.util.List;

public class TemperatureSensor {
    List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    void alarm() {
        observers.forEach(observer -> {
            observer.alarm();
        });
    }
}
