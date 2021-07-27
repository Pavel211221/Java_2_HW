package hw1;

import hw1.obstacle.Obstacle;
import hw1.obstacle.Wall;
import hw1.obstacle.Cross;
import hw1.sport.Cat;
import hw1.sport.Human;
import hw1.sport.Robot;
import hw1.sport.Sport;

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
