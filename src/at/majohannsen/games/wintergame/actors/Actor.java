package at.majohannsen.games.wintergame.actors;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public interface Actor {
    public void update(GameContainer gameContainer, int deltaTime);
    public void render(GameContainer gameContainer, Graphics graphics);
}
