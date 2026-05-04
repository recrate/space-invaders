package spaceinvadersProject.rendering;

import javashooter.gameobjects.GameObject;
import javashooter.rendering.RectArtist;

import java.awt.*;

public class FlashArtist extends RectArtist {
    public double startGameTime;
    public FlashArtist(GameObject go, double width, double height, Color color) {
        super(go, width, height, color);
        this.startGameTime = gameObject.getGameTime();
    }

    @Override
    public void draw(Graphics2D g2) {
        if((int) (gameObject.getGameTime() * 5) % 2 == 1) g2.setColor(Color.BLUE);
        else g2.setColor(Color.YELLOW);

        System.out.println(gameObject.getGameTime());

        g2.fillRect((int)(-this.width / (double)2.0F), (int)(-this.height / (double)2.0F), (int)this.width, (int)this.height);
    }

}
