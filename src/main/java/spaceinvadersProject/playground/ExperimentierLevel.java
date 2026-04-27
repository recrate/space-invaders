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
    public void prepareLevel(String id) {
        localGameTime = getGameTime();
        super.prepareLevel(id);

        ExperimentierLevel level = new ExperimentierLevel();

        RectObject redRect = new RectObject("redRect", level, 100, 100, 10, 10, 80, 10, Color.RED);
        addObject(redRect);

        for(int i = 0; i < 100; i++) {
            int speed = (int) (Math.random() * 60);
            if(speed % 2 == 0) {
                speed = speed / 2;
            } else {
                speed = (speed / 2) * (-1);
            }

            RectObject explosionRect = new RectObject("explosionRect" + i, level, 250, 250, speed, speed, 2, 2, Color.RED);
            addObject(explosionRect);
        }
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
