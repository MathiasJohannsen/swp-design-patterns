package at.majohannsen.games.wintergame;

public class SingletonCounter {
    private static SingletonCounter instance = null;
    private int counter = 0;

    public static SingletonCounter getInstance() {
        if (instance == null) {
            instance = new SingletonCounter();
        }
        return instance;
    }

    public void increaseCounter() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
