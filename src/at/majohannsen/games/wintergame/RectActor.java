package at.majohannsen.games.wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class RectActor implements Actor{
    private float w,h;
    MoveStrategy mv;

    public RectActor(MoveStrategy mv, float width, float height) {
        this.mv = mv;
        this.w = width;
        this.h = height;
    }

    @Override
    public void update(GameContainer gameContainer, int deltaTime) {
        mv.update(deltaTime);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) {
        graphics.drawRect(mv.getX(),mv.getY(),w,h);
    }
}
