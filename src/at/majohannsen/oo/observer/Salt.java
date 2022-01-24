package at.majohannsen.oo.observer;

public class Salt implements Observer {
    public void alarm() {
        System.out.println("Salting alarm");
    }

    public void doSalting() {
        System.out.println("I am salting");
    }
}
