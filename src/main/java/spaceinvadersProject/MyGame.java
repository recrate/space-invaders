package spaceinvadersProject;

import javashooter.gameutils.GameLoop;
import javashooter.playground.Playground;
import spaceinvadersProject.playground.Level1;

public class MyGame extends GameLoop {

    public MyGame() {
        super();
    }

    @Override
    public Playground nextLevel(Playground playground) {
        return new Level1();
    }

    static void main(String[] args) {
        new MyGame().runGame(args);
    }
}
