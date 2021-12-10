package lesson1;

public class Main {

    public static void main(String[] args) {

       DayOfWeek.MONDAY.getWorkingHours();

        Competitor competitors[] = new Competitor[5];
        competitors[0] = new Cat("Пушистик", 1.4, 15);
        competitors[1] = new Robot("R2D2", 10, 3000);
        competitors[2] = new Human("Люк", 1.7, 60);
        competitors[3] = new Cat("Кисуня",2.45,20);
        competitors[4] = new Human("Хан Соло",2.5, 100);

        Obstacles obstacles[] = new Obstacles[5];
        obstacles[0] = new Wall(1);
        obstacles[1] = new Treadmill(5);
        obstacles[2] = new Wall(2);
        obstacles[3] = new Treadmill(15);
        obstacles[4] = new Wall(5);


            for (int i = 0; i < competitors.length; i++) {
                System.out.println("Испытание проходит " + competitors[i].name());
                for (int j = 0; j < obstacles.length; j++) {
                    ;
                    if (!obstacles[j].checkTheObstacle(competitors[i])) {
                        System.out.println(competitors[i].name() + " выбывает из соревнования");
                        break;
                    } else if (j == (obstacles.length - 1)) {
                        System.out.println(competitors[i].name() + " прошел все препятствия!");
                    }
                }
                System.out.println();
            }
    }
}