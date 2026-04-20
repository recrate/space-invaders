package spaceinvadersProject.playground;

public class ProjektLevel1 extends ProjectLevel {
    private int nr_enemies = 1;
    private double enemySpeedX = 160;
    private double enemySpeedY = 80;

    @Override
    public String getName() {
        return "level1";
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
        return "Level 1!";
    }
}
