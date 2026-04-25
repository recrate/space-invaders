package spaceinvadersProject;

import io.github.classgraph.ClassGraph;
import io.github.classgraph.ScanResult;
import javashooter.gameutils.GameLoop;
import javashooter.playground.Playground;
import spaceinvadersProject.playground.SpaceInvadersLevel;

import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.List;

public class Testat1Game extends GameLoop {

    private int getLevelNumber(String name) {
        String number = name.replaceAll("\\D+", "");
        if (number.isEmpty()) return Integer.MAX_VALUE;
        return Integer.parseInt(number);
    }

    @Override
    public Playground nextLevel(Playground playground) {
        try (ScanResult scan = new ClassGraph()
                .acceptPackages("spaceinvadersProject.playground")
                .enableClassInfo()
                .scan()
        ) {
            List<SpaceInvadersLevel> levels = scan
                    .getSubclasses(SpaceInvadersLevel.class.getName())
                    .loadClasses(SpaceInvadersLevel.class)
                    .stream()
                    .filter(c -> !Modifier.isAbstract(c.getModifiers()))
                    .map(c -> {
                        try {
                            return c.getDeclaredConstructor().newInstance();
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    })
                    .sorted(Comparator.comparingInt(c -> getLevelNumber(c.getName())))
                    .toList();

            if (levels.isEmpty()) return null;
            if (playground == null) return levels.getFirst();
            if (!(playground instanceof SpaceInvadersLevel currentLevel)) return null;

            String currentLevelName = currentLevel.getName();

            for (int i = 0; i < levels.size(); i++) {
                if (levels.get(i).getName().equals(currentLevelName)) {
                    return (i + 1 < levels.size()) ? levels.get(i + 1) : null;
                }
            }

            return levels.getFirst();

        }
    }

    static void main(String[] args) {
        System.out.println("Hallo");
        new Testat1Game().runGame(args);
    }
}
