package at.majohannsen.games.wintergame.actors;

import at.majohannsen.games.wintergame.movements.MoveStrategy;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class OvalActor extends AbstractActor {
    private float w,h;

    public OvalActor(MoveStrategy mv, float width, float height) {
        super(mv);
        this.w = width;
        this.h = height;
    }

    public void render(GameContainer gameContainer, Graphics graphics) {
        graphics.drawOval(mv.getX(),mv.getY(),w,h);
    }
}
