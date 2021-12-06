package at.majohannsen.games.wintergame;

import org.newdawn.slick.*;

import java.util.Random;

public class CircleActor implements Actor {
    private float size;
    private MoveStrategy mv;

    public CircleActor(MoveStrategy mv, float size) {
        this.mv = mv;
        this.size = size;
    }

    public void update(GameContainer gameContainer, int deltaTime) {
        mv.update(deltaTime);
    }

    public void render(GameContainer gameContainer, Graphics graphics) {
        graphics.drawOval(mv.getX(),mv.getY(),size,size);
    }
}
