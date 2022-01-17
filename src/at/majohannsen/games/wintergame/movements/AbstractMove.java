package at.majohannsen.games.wintergame.movements;

public abstract class AbstractMove implements MoveStrategy {
    protected float x,y;

    public AbstractMove(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void update(int deltaTime) {
        if (this.x > 800) {
            this.x = 0;
        }
        else if (this.x < 0) {
            this.x = 800;
        }
        if (this.y > 600) {
            this.y = 0;
        }
        else if (this.y < 0) {
            this.y = 600;
        }
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
}
