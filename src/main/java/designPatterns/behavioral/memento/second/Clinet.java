package designPatterns.behavioral.memento.second;

public class Clinet {
    public static void main(String[] arg) throws InterruptedException {
        Time time = new Time();
        TimeCareTaker timeCareTaker = new TimeCareTaker();

        time.setTime();
        timeCareTaker.addState(time.saveToMemento());
        Thread.sleep(2000);

        time.setTime();
        timeCareTaker.addState(time.saveToMemento());
        Thread.sleep(2000);

        time.setTime();
        timeCareTaker.addState(time.saveToMemento());
        Thread.sleep(2000);
        time.restoreFromMemento(timeCareTaker.get(0));
        System.out.println("Fist time record was :" + time.getTime());
        time.restoreFromMemento(timeCareTaker.get(1));
        System.out.println("Second time record was :" + time.getTime());
        time.restoreFromMemento(timeCareTaker.get(2));
        System.out.println("Third time record was :" + time.getTime());

    }

}
