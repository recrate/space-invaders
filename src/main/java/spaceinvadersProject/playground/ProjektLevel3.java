package spaceinvadersProject.playground;

public class ProjektLevel3 extends ProjectLevel{
    private int nr_enemies = 10;
    private double enemySpeedX = 800;
    private double enemySpeedY = 140;

    @Override
    public String getName() {
        return "level3";
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
        return "Level 3!";
    }
}
