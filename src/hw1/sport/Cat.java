package hw1.sport;

public class Cat implements Sport {

    private int maxRun;
    private int maxJump;

    public Cat(int maxRan, int maxJump) {
        this.maxRun = maxRan;
        this.maxJump = maxJump;
    }

    public Cat() {this(300,3);}

    @Override
    public boolean run(int dist) {
        if (dist <= maxRun) {
            System.out.println("Кот успешно пробежал " + dist + "м");
            return true;
        } else {
            System.out.println("Кот не смог пробежать " + dist + "м");
        return false;
    }
    }

    @Override
    public boolean jump(int dist) {
        if (dist <= maxJump) {
            System.out.println("Кот успешно прыгнул " + dist + "м");
            return true;
        } else {
            System.out.println("Кот не смог прыгнуть " + dist + "м");
            return false;
        }
    }}
