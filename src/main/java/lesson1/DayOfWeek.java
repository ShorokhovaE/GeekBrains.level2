package lesson1;

public enum DayOfWeek {

    MONDAY(40),
    TUESDAY(32),
    WEDNESDAY(24),
    THURSDAY(16),
    FRIDAY(8),
    SATURDAY(0),
    SUNDAY(0);

    private int workingHours;

    DayOfWeek(int workingHours) {
        this.workingHours = workingHours;
    }

    public void getWorkingHours() {
        if(workingHours == 0){
            System.out.println("Сегодня выходной");
        } else {
            System.out.println("До конца рабочей недели осталось " + workingHours + " часов");
        }
        }
    }
