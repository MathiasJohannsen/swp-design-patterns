package at.majohannsen.oo.motor;

public class Car {

    private MotorControler mc;

    public Car(MotorControler motorControler) {
        this.mc = motorControler;
    }

    public int getDriveParameter() {
        return mc.drive();
    }
}
