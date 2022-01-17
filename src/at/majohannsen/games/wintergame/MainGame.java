package at.majohannsen.games.wintergame;

import at.majohannsen.games.wintergame.actors.Actor;
import at.majohannsen.games.wintergame.actors.CircleActor;
import at.majohannsen.games.wintergame.actors.OvalActor;
import at.majohannsen.games.wintergame.actors.RectActor;
import at.majohannsen.games.wintergame.movements.MoveDiagonal;
import at.majohannsen.games.wintergame.movements.MoveStrategy;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class MainGame extends BasicGame {
    List<Actor> actors = new ArrayList<>();

    public MainGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        for (int i = 0; i < 10; i++) {
            actors.add(RandomActorFactory.getRandomActor());
        }
    }

    @Override
    public void update(GameContainer gameContainer, int deltaTime) throws SlickException {
        for (Actor actor : actors) {
            actor.update(gameContainer, deltaTime);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor : actors) {
            actor.render(gameContainer, graphics);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MainGame("WinterGame"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
