package spaceinvadersProject;

import javashooter.gameutils.GameLoop;
import javashooter.playground.Playground;
import spaceinvadersProject.playground.ProjektLevel1;
import spaceinvadersProject.playground.ProjektLevel2;
import spaceinvadersProject.playground.ProjektLevel3;

public class Testat1Game extends GameLoop {

    @Override
    public Playground nextLevel(Playground playground) {
        if (playground == null) {
            return new ProjektLevel1() {};
        }

        if(playground.getName().equals("level1")) {
            return new ProjektLevel2();
        }

        if(playground.getName().equals("level2")) {
            return new ProjektLevel3();
        }

        return null;

    }

    static void main(String[] args) {
        new Testat1Game().runGame(args);

        /*
        gibt "XXX" auf der Konsole aus, ist aber unnötig damit resourcen zu verschwenden
        Playground level1 = new ProjektLevel1();
        Playground level2 = new ProjektLevel2();
        Playground level3 = new ProjektLevel3();
         */


    }
}
