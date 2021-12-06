package at.majohannsen.games.wintergame;

public class MoveDown implements MoveStrategy {
    private float x,y,speed;

    public MoveDown(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void update(int deltaTime) {
        this.y += deltaTime * speed;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getSpeed() {
        return speed;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
}
