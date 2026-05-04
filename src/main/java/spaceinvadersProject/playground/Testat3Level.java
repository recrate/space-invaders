package spaceinvadersProject.playground;

import javashooter.controller.KinematicsController;
import javashooter.gameobjects.GameObject;
import javashooter.gameobjects.RectObject;
import spaceinvadersProject.rendering.FlashArtist;

import java.awt.*;

public class Testat3Level extends SpaceInvadersLevel{
    @Override
    public void setupInitialState() {
        super.setupInitialState();

        // Wenn keine Collider, dann wird auch nicht die actionIfEgoCollidesWithEnemy Funktion aufgerufen.
        // --> weil keine collider
        RectObject fly_enemy1 = new RectObject("fly_enemy1", this, 300.0, 300.0, 30.0, 20.0, 30.0, 30.0, Color.BLUE).generateColliders();
        fly_enemy1.setController(new KinematicsController());
        addObject(fly_enemy1);

        RectObject fly_enemy2 = new RectObject("fly_enemy2", this, 200.0, 200.0, 0.0, 20.0, 30.0, 30.0, Color.GREEN).generateColliders();
        fly_enemy2.setController(new KinematicsController());
        addObject(fly_enemy2);

        RectObject fly_enemy3 = new RectObject("fly_enemy3", this, 100.0, 200.0, 0.0, 20.0, 150.0, 150.0, Color.GREEN).generateColliders();
        fly_enemy3.setController(new KinematicsController());

        Color[] colors = {Color.BLUE, Color.RED, Color.GREEN, Color.PINK, Color.CYAN, Color.MAGENTA, Color.YELLOW, Color.PINK};
        FlashArtist fa = new FlashArtist(fly_enemy3, fly_enemy3.getW(), fly_enemy3.getH(), colors);
        fly_enemy3.addArtist(fa);

        addObject(fly_enemy3);
    }

    @Override
    public void actionIfEgoCollidesWithEnemy(GameObject enemy, GameObject ego){
        super.actionIfEgoCollidesWithEnemy(enemy, ego);
        if(enemy.getName().equals("fly_enemy1") || enemy.getName().equals("fly_enemy2")) System.out.println("AUA");
    }

    @Override
    public void actionIfEnemyIsHit(GameObject enemy, GameObject shot) {
        if(enemy.getName().equals("fly_enemy1") || enemy.getName().equals("fly_enemy2") || enemy.getName().equals("fly_enemy3")) return;
        super.actionIfEnemyIsHit(enemy, shot);
    }
}
