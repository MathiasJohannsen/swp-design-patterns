package at.majohannsen.games.wintergame;

public interface MoveStrategy {
    float getX();
    float getY();
    void update(int deltaTime);
}
