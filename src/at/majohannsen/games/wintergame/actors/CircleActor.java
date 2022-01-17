package at.majohannsen.games.wintergame.actors;

import at.majohannsen.games.wintergame.movements.MoveStrategy;
import org.newdawn.slick.*;

public class CircleActor extends AbstractActor {
    private float size;

    public CircleActor(MoveStrategy mv, float size) {
        super(mv);
        this.size = size;
    }

    public void render(GameContainer gameContainer, Graphics graphics) {
        graphics.drawOval(mv.getX(),mv.getY(),size,size);
    }
}
