package at.majohannsen.oo.motor;

public class Main {
    public static void main(String[] args) {
        MotorControler mc1 = new TopSpeed();
        Car c1 = new Car(mc1);
        System.out.println(c1.getDriveParameter());
    }
}
