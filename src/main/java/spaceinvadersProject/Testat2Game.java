package spaceinvadersProject;

import javashooter.gameutils.GameLoop;
import javashooter.playground.Playground;
import spaceinvadersProject.playground.ExperimentierLevel;

public class Testat2Game extends GameLoop {

    @Override
    public Playground nextLevel(Playground playground) {
        if (playground == null) {
            return new ExperimentierLevel();
        }

        return null;
    }
}
