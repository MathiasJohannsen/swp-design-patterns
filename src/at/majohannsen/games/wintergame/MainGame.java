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
        MoveStrategy mr = new MoveDiagonal(200, 100, 0.5f, 0);
        MoveStrategy ml = new MoveDiagonal(500,500,0.5f, 0);
        MoveStrategy mu = new MoveDiagonal(100,500,0,0.5f);
        MoveStrategy md = new MoveDiagonal(500,100,0,0.5f);
        actors.add(new CircleActor(mr, 50));
        actors.add(new RectActor(md, 200,40));
        actors.add(new OvalActor(mu, 20, 100));
        actors.add(new RectActor(ml, 20,30));
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
