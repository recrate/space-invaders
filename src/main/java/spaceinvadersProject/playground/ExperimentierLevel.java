package spaceinvadersProject.playground;

import javashooter.playground.Playground;

import java.awt.*;

public class ExperimentierLevel extends Playground {
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
        return false;
    }

    @Override
    public boolean resetRequested() {
        return false;
    }

    @Override
    public void redrawLevel(Graphics2D graphics2D) {

    }

    @Override
    public void prepareLevel(String s) {
        System.out.println("Hello World!");
    }
}
