package hw1.sport;

public class Human implements Sport {

    private int maxRun;
    private int maxJump;

    public Human(int maxRan, int maxJump) {
        this.maxRun = maxRan;
        this.maxJump = maxJump;
    }

    public Human() {this(3000,2);}

    @Override
    public boolean run(int dist) {
        if (dist <= maxRun) {
            System.out.println("Человек успешно пробежал " + dist + "м");
            return true;
        } else {
            System.out.println("Человек не смог пробежать " + dist + "м");
            return false;
        }
    }

    @Override
    public boolean jump(int dist) {
        if (dist <= maxJump) {
            System.out.println("Человек успешно прыгнул " + dist + "м");
            return true;
        } else {
            System.out.println("Человек не смог прыгнуть " + dist + "м");
            return false;
        }
    }}
