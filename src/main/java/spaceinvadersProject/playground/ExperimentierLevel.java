package spaceinvadersProject.playground;

import javashooter.gameobjects.RectObject;
import javashooter.playground.Playground;

import java.awt.*;

public class ExperimentierLevel extends SpaceInvadersLevel {
    double localGameTime = 0;

    @Override
    public String getName() {
        return "Test";
    }

    @Override
    public int preferredSizeX() {
        return 500;
    }

    @Override
    public int preferredSizeY() {
        return 500;
    }

    @Override
    public void applyGameLogic() {
        RectObject redRect = new RectObject("redRect", new ExperimentierLevel(), 100, 100, 1000, 1000, 80, 10, Color.RED);
        addObject(redRect);

    }

    @Override
    public void prepareLevel(String id) {
        localGameTime = getGameTime();
        super.prepareLevel(id);
    }

    @Override
    public double getTimestep() {
        if (this.gameTime >= (localGameTime + 3.0)) {
            System.out.println(this.gameTime);
            this.doneLevel = true;
        }
        return super.getTimestep();
    }
}
