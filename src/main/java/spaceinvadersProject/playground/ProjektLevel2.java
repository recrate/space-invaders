package spaceinvadersProject.playground;

public class ProjektLevel2 extends ProjektLevel {

    @Override
    public String getName() {
        return "Level2";
    }

    @Override
    protected int calcNrEnemies() {
        return 5;
    }

    @Override
    protected double calcEnemySpeedX() {
        return 480;
    }

    @Override
    protected double calcEnemySpeedY() {
        return 80;
    }
}
