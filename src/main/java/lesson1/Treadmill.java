package lesson1;

public class Treadmill implements Obstacles{
    private double length;

    public Treadmill (double length) {
        this.length = length;
    }
/*
    public void run (double maxRunLength){
        if (maxRunLength == length ) {
            System.out.println("Успешно пробежал");
        } else {
            System.out.println("Не смог пробежать");

        }
    }*/

    @Override
    public void passTheObstacle(Competitor competitor) {
        if (competitor.maxRun() >= length ) {
            System.out.println("Успешно пробежал");
        } else {
            System.out.println("Не смог пробежать");
        }
    }

    @Override
    public boolean checkTheObstacle(Competitor competitor) {
        if (competitor.maxRun() >= length ) {
            return true;
        } else {
            return false;
        }
    }

}
