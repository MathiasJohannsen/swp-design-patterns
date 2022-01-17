package at.majohannsen.games.wintergame;

public class MoveDiagonal extends AbstractMove {
    protected float speedX, speedY;
    public MoveDiagonal(float x, float y, float speedX, float speedY) {
        super(x, y);
        this.speedX = speedX;
        this.speedY = speedY;
    }

    public void update(int deltaTime) {
        this.x += deltaTime * speedX;
        this.y += deltaTime * speedY;
        super.update(deltaTime);
    }
}
