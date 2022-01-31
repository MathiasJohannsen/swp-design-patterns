package at.majohannsen.oo.motor;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private MotorControllerSingleton mc;
    private List<SpeedObserver> observers = new ArrayList<>();

    public Car(DriveStrategy strategy) {
        MotorControllerSingleton.setStrategy(strategy);
        mc = MotorControllerSingleton.getInstance();
        observers.add(mc);
    }

    public int driveMode() {
        return mc.driveMode();
    }

    public void drive(int speed) {
        for (SpeedObserver o : observers) {
            o.rangeReached(speed);
        }
    }

    public void addObserver(SpeedObserver o) {
        observers.add(o);
    }
}