package HomeWork1.obstacle;

import HomeWork1.sport.Sport;

public class Cross implements Obstacle{

    private int dist;

    public Cross(int dist) {
        this.dist = dist;
    }

    @Override
    public boolean doIt(Sport c) {
        return c.run(dist);
    }
}
