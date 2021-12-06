package at.majohannsen.games.wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class OvalActor implements Actor {
    private float x,y,w,h;

    public OvalActor(float x, float y, float width, float height) {
        this.x = x;
        this.y = y;
        this.w = width;
        this.h = height;
    }

    public void update(GameContainer gameContainer, int deltaTime) {
        x += 1;
        y += 0.5;
    }

    public void render(GameContainer gameContainer, Graphics graphics) {
        graphics.drawOval(x,y,w,h);
    }
}
