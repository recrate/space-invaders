package spaceinvadersProject.playground;

public class ProjektLevel3 extends ProjektLevel {

    @Override
    public String getName() {
        return "Level3";
    }

    @Override
    protected int calcNrEnemies() {
        return 10;
    }

    @Override
    protected double calcEnemySpeedX() {
        return 800;
    }

    @Override
    protected double calcEnemySpeedY() {
        return 140;
    }
}
