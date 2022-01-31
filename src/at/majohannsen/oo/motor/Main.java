package at.majohannsen.oo.motor;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(new TopSpeed());
        c1.addObserver(new LightController());
        System.out.println(c1.driveMode());

        c1.drive(40);
        System.out.println(c1.driveMode());
        c1.drive(70);
        System.out.println(c1.driveMode());
        c1.drive(110);
        System.out.println(c1.driveMode());
        c1.drive(200);
        System.out.println(c1.driveMode());
    }
}
