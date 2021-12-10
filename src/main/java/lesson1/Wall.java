package lesson1;

public class Wall implements Obstacles{
    private double height;

    public Wall (double height) {
        this.height = height;
    }


  /*  public void jump (double maxJumpHeigth){
        if (maxJumpHeigth == height ) {
            System.out.println("Успешно прыгнул");
        } else {
            System.out.println("Не смог прыгнуть");

        }
    }*/

    @Override
    public void passTheObstacle(Competitor competitor) {
        if (competitor.maxJump() >= height ) {
            System.out.println("Успешно прыгнул");
        } else {
            System.out.println("Не смог прыгнуть");
        }
    }

    @Override
    public boolean checkTheObstacle(Competitor competitor) {
        if(competitor.maxJump() >= height) {
            return true;
        } else {
            return false;
        }
    }
}
