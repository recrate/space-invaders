package spaceinvadersProject;

import javashooter.gameutils.GameLoop;
import javashooter.playground.Playground;
import spaceinvadersProject.playground.SpaceInvadersLevel;

public class MyGame extends GameLoop {

    @Override
    public Playground nextLevel(Playground playground) {
        if (playground != null) {
            return null;
        }

        return new SpaceInvadersLevel() {};
    }

    static void main(String[] args) {
        new MyGame().runGame(args);
    }
}
