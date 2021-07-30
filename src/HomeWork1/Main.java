package HomeWork1;

import HomeWork1.obstacle.Obstacle;
import HomeWork1.obstacle.Wall;
import HomeWork1.obstacle.Cross;
import HomeWork1.sport.Cat;
import HomeWork1.sport.Human;
import HomeWork1.sport.Robot;
import HomeWork1.sport.Sport;

public class Main {
    public static void main(String[] args) {

        Sport[] sports = {
                new Human(),
                new Cat(),
                new Robot(),
                new Cat(600,5)
        };

        Obstacle[] obstacles = {
                new Cross(500),
                new Wall(1),
        };

        for (Sport c : sports) {
            for (Obstacle o : obstacles ) {
                if (!o.doIt(c)){
                    break;
                }
            }
        }
    }
}
