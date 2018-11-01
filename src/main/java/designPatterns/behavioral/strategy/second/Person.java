package designPatterns.behavioral.strategy.second;

public class Person implements Profesion, Drive, FreeTime {


    private Profesion profesion;
    private Drive drive;
    private FreeTime freeTime;

    public Person(Profesion profesion, Drive drive, FreeTime freeTime) {
        this.profesion = profesion;
        this.drive = drive;
        this.freeTime = freeTime;
    }

    public void drive() {
        drive.drive();
    }

    public void spendFreeTime() {
        freeTime.spendFreeTime();
    }

    public void work() {
        profesion.work();
    }
}
