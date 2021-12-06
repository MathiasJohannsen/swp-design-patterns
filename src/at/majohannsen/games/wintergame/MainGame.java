package at.majohannsen.games.wintergame;

import org.newdawn.slick.*;

import java.util.List;

public class MainGame extends BasicGame {
    List<Actor> actors;

    public MainGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        MoveRight mr = new MoveRight(200, 100, 50);
        actors.add(new CircleActor(mr, 50));
        actors.add(new RectActor(200,100, 50, 200));
        actors.add(new OvalActor(200,100, 20, 100));
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
