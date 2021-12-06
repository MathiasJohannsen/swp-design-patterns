package at.majohannsen.games.wintergame;

import org.newdawn.slick.*;
import org.newdawn.slick.openal.MODSound;

import java.lang.module.ModuleFinder;
import java.util.ArrayList;
import java.util.List;

public class MainGame extends BasicGame {
    List<Actor> actors = new ArrayList<>();

    public MainGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        MoveStrategy mr = new MoveRight(200, 100, 0.5f);
        MoveStrategy ml = new MoveLeft(500,500,0.5f);
        MoveStrategy mu = new MoveUp(100,500,0.5f);
        MoveStrategy md = new MoveDown(500,100,0.5f);
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
