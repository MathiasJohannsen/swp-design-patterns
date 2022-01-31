package at.majohannsen.oo.motor;

public class MotorControllerSingleton implements SpeedObserver{
    private static MotorControllerSingleton instance;
    private static DriveStrategy strategy;

    private MotorControllerSingleton() {};

    public static MotorControllerSingleton getInstance() {
        if (instance == null) {
            instance = new MotorControllerSingleton();
        }
        return instance;
    }

    public static void setInstance(MotorControllerSingleton i) {
        instance = i;
    }

    public int driveMode() {
        return strategy.driveMode();
    }

    @Override
    public void rangeReached(int range) {
        if (range > 100) {
            strategy = new SuperSpar();
        }
        else if (range > 50) {
            strategy = new TopSpeed();
        }
        else if (range > 0) {
            strategy = new Economy();
        }
        else {
            System.out.println("Hoppla, wir fahren rückwärts...");
        }
    }

    public static DriveStrategy getStrategy() {
        return strategy;
    }

    public static void setStrategy(DriveStrategy strategy) {
        MotorControllerSingleton.strategy = strategy;
    }
}
