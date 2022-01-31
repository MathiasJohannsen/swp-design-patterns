package at.majohannsen.oo.motor;

public class MotorController implements SpeedObserver{
    private static DriveStrategy strategy;

    public MotorController(DriveStrategy strategy) {
        setStrategy(strategy);
    }

    public int driveMode() {
        return strategy.driveMode();
    }

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

    public DriveStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(DriveStrategy strategy) {
        MotorController.strategy = strategy;
    }
}
