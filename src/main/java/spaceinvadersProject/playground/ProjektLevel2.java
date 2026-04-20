package spaceinvadersProject.playground;

public class ProjektLevel2 extends ProjectLevel{
    private int nr_enemies = 5;
    private double enemySpeedX = 480;
    private double enemySpeedY = 80;

    @Override
    public String getName() {
        return "level2";
    }

    @Override
    public int calcNrEnemies() {
        return nr_enemies;
    }

    @Override
    public double calcEnemySpeedX() {
        return enemySpeedX;
    }

    @Override
    public double calcEnemySpeedY() {
        return enemySpeedY;
    }

    @Override
    protected String getStartupMessage() {
        return "Level 2!";
    }
}
