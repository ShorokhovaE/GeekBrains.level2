package lesson1;

public class Cat implements Competitor{

    private String name;
    private double maxJump;
    private double maxRun;

    public Cat(String name, double maxJump, double maxRun) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    @Override
    public double maxJump() {
        return maxJump;
    }

    @Override
    public double maxRun() {
        return maxRun;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public void jump() {
        System.out.println(name + " прыгнул");
    }

    @Override
    public void run() {
        System.out.println(name +" побежал");
    }


    public String getName() {
        return name;
    }
}
