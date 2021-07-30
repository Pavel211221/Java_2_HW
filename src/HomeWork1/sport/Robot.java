package HomeWork1.sport;

public class Robot implements Sport {

    private int maxRun;
    private int maxJump;

    public Robot(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public Robot() {this(500,1);}

    @Override
    public boolean run(int dist) {
        if (dist <= maxRun) {
            System.out.println("Робот успешно пробежал " + dist + "м");
            return true;
        } else {
            System.out.println("Робот не смог пробежать " + dist + "м");
            return false;
        }
    }

    @Override
    public boolean jump(int dist) {
        if (dist <= maxJump) {
            System.out.println("Робот успешно прыгнул " + dist + "м");
            return true;
        } else {
            System.out.println("Робот не смог прыгнуть " + dist + "м");
            return false;
        }
    }}
