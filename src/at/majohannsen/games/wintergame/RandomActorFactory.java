package at.majohannsen.games.wintergame;

import at.majohannsen.games.wintergame.actors.Actor;
import at.majohannsen.games.wintergame.actors.CircleActor;
import at.majohannsen.games.wintergame.actors.OvalActor;
import at.majohannsen.games.wintergame.actors.RectActor;
import at.majohannsen.games.wintergame.movements.MoveDiagonal;
import at.majohannsen.games.wintergame.movements.MoveStrategy;

import java.util.Random;

public class RandomActorFactory {
    public static Actor getRandomActor() {
        Random r = new Random();
        MoveStrategy mv = new MoveDiagonal(r.nextInt(600), r.nextInt(800), r.nextFloat()-0.5f, r.nextFloat()-0.5f);
        int n = r.nextInt(3);
        switch (n) {
            case 0:
                return new CircleActor(mv, r.nextInt(50));
            case 1:
                return new OvalActor(mv, r.nextInt(50), r.nextInt(50));
            case 2:
                return new RectActor(mv, r.nextInt(100), r.nextInt(50));
            default:
                return new CircleActor(mv, 5);
        }
    }
}
