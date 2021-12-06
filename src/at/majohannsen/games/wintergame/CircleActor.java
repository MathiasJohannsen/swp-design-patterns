package at.majohannsen.games.wintergame;

import org.newdawn.slick.*;

import java.util.Random;

public class CircleActor implements Actor {
    private float size;
    private MoveRight mr;

    public CircleActor(MoveRight mr, float size) {
        this.mr = mr;
        this.size = size;
    }

    public void update(GameContainer gameContainer, int deltaTime) {
        mr.update(gameContainer, deltaTime);
    }

    public void render(GameContainer gameContainer, Graphics graphics) {
        graphics.drawOval(mr.getX(),mr.getY(),size,size);
    }
}
