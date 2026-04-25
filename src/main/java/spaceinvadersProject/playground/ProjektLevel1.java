package spaceinvadersProject.playground;

import javashooter.gameobjects.GameObject;

public class ProjektLevel1 extends ProjektLevel {

    @Override
    public String getName() {
        return "Level1";
    }

    @Override
    protected int calcNrEnemies() {
        return 1;
    }

    @Override
    protected double calcEnemySpeedX() {
        return 160;
    }

    @Override
    protected double calcEnemySpeedY() {
        return 80;
    }

    @Override
    protected void actionIfEnemyIsHit(GameObject e, GameObject shot) {
        System.out.println("AUA!");
        super.actionIfEnemyIsHit(e, shot);
    }
}
