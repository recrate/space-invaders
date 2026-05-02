package spaceinvadersProject.playground;

import javashooter.controller.KinematicsController;
import javashooter.gameobjects.GameObject;
import javashooter.gameobjects.RectObject;
import javashooter.playground.Playground;

import java.awt.*;

public class ExperimentierLevel extends Playground {
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


    }

    @Override
    public boolean gameOver() {
        return false;
    }

    @Override
    public boolean levelFinished() {
        return (super.getGameTime() >= 3.0);
    }

    @Override
    public boolean resetRequested() {
        return false;
    }

    @Override
    public void prepareLevel(String id) {
        //localGameTime = getGameTime();
        //SpaceInvadersLevel.prepareLevel(id);


        KinematicsController kc = new KinematicsController();


        RectObject redRect = new RectObject("redRect", this, 100, 100, 10, 10, 80, 10, Color.RED);
        redRect.setOmega(3.60);
        redRect.setController(kc);
        addObject(redRect);

        for(int i = 0; i < 100; i++) {
            int speedx = (int) (Math.random() * 61);
            int speedy = (int) (Math.random() * 61);
            if(speedx % 2 == 0) {
                speedx = speedx / 2;
                System.out.println(speedx);
            } else {
                speedx = (speedx / 2) * (-1);
                System.out.println(speedx);
            }

            if(speedy % 2 == 0) {
                speedy = speedy / 2;
                System.out.println(speedy);
            } else {
                speedy = (speedy / 2) * (-1);
                System.out.println(speedy);
            }

            RectObject explosionRect = new RectObject("explosionRect" + i, this, 250, 250, speedx, speedy, 2, 2, Color.RED);
            explosionRect.setPhi(3.0);
            addObject(explosionRect);
            explosionRect.setController(new KinematicsController());
        }
    }

    /*
    @Override
    public double getTimestep() {
        if (this.gameTime >= (localGameTime + 3.0)) {
            System.out.println(this.gameTime);
            this.doneLevel = true;
        }
        return super.getTimestep();
    }
    */

    @Override
    public void redrawLevel(Graphics2D graphics2D) {

    }
}
