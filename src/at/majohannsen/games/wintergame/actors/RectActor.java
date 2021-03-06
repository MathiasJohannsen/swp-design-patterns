package at.majohannsen.games.wintergame.actors;

import at.majohannsen.games.wintergame.movements.MoveStrategy;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class RectActor extends AbstractActor {
    private float w,h;

    public RectActor(MoveStrategy mv, float width, float height) {
        super(mv);
        this.w = width;
        this.h = height;
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) {
        graphics.drawRect(mv.getX(),mv.getY(),w,h);
    }
}
