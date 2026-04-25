package spaceinvadersProject.playground;

public abstract class ProjektLevel extends SpaceInvadersLevel {
    public ProjektLevel() {
        System.out.println("XXX");
        super();
    }

    @Override
    protected String getStartupMessage() {
        return getName();
    }
}
