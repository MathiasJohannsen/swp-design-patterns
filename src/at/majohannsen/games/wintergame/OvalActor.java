package at.majohannsen.games.wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class OvalActor implements Actor {
    private float w,h;
    MoveStrategy mv;

    public OvalActor(MoveStrategy mv, float width, float height) {
        this.mv = mv;
        this.w = width;
        this.h = height;
    }

    public void update(GameContainer gameContainer, int deltaTime) {
        mv.update(deltaTime);
    }

    public void render(GameContainer gameContainer, Graphics graphics) {
        graphics.drawOval(mv.getX(),mv.getY(),w,h);
    }
}
