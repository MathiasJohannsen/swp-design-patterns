package at.majohannsen.games.wintergame.movements;

public interface MoveStrategy {
    float getX();
    float getY();
    void update(int deltaTime);
}
