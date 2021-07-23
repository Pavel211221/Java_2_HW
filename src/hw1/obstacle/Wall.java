package hw1.obstacle;

import hw1.sport.Sport;

public class Wall implements Obstacle{

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean doIt(Sport c) {
        return c.jump(height);
    }
}
