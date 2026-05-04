package spaceinvadersProject.rendering;

import javashooter.gameobjects.GameObject;
import javashooter.rendering.RectArtist;

import java.awt.*;

public class FlashArtist extends RectArtist {
    public int colorCount;
    public Color[] colors;
    public int i = 0;
    public FlashArtist(GameObject go, double width, double height, Color[] colors) {
        super(go, width, height, colors[0]);
        this.colorCount = colors.length - 1;
        this.colors = colors;
    }



    @Override
    public void draw(Graphics2D g2) {

        if((int) (gameObject.getGameTime() * 8) % this.colorCount == 1) {
            g2.setColor(colors[i]);
            if(i < colorCount) i++;
            else i = 0;
        }
        else {
            g2.setColor(colors[i]);
            if(i < colorCount) i++;
            else i = 0;
        }

        g2.fillRect((int)(-this.width / (double)2.0F), (int)(-this.height / (double)2.0F), (int)this.width, (int)this.height);


    }

}
