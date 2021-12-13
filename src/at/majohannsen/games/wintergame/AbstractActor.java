package at.majohannsen.games.wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public abstract class AbstractActor implements Actor{
    protected MoveStrategy mv;

    public AbstractActor(MoveStrategy mv) {
        this.mv = mv;
    }

    @Override
    public void update(GameContainer gameContainer, int deltaTime) {
        mv.update(deltaTime);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) {

    }
}
