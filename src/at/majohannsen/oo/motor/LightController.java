package at.majohannsen.oo.motor;

public class LightController implements SpeedObserver {

    @Override
    public void rangeReached(int range) {
        System.out.println("Lichtsteuerung hier, range ist " + range);
    }
}
