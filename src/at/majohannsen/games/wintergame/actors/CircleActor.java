package at.majohannsen.games.wintergame;

import org.newdawn.slick.*;

import java.util.Random;

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
