package spaceinvadersProject.playground;

public class Level1 extends SpaceInvadersLevel {
    public Level1() {
        super();
    }

    @Override
    public String getName() {
        return "Level1";
    }

    @Override
    protected String getStartupMessage() {
        return "Get ready for level 1!";
    }
}
