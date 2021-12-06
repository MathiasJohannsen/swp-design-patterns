package at.majohannsen.games.wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class RectActor implements Actor{
    private float x,y,w,h;

    public RectActor(float x, float y, float width, float height) {
        this.x = x;
        this.y = y;
        this.w = width;
        this.h = height;
    }

    @Override
    public void update(GameContainer gameContainer, int deltaTime) {
        x += 0.3;
        y += 0.6;
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) {
        graphics.drawRect(x,y,w,h);
    }
}
