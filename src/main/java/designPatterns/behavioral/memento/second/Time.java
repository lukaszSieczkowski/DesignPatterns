package designPatterns.behavioral.memento.second;

import java.time.LocalTime;

public class Time {
    private LocalTime time;

    public void setTime() {
        this.time =  LocalTime.now();
        System.out.println("Current time is: "+this.time);
    }

    public LocalTime getTime() {
        return time;
    }

    public Memento saveToMemento() {
        System.out.println("Saving time to Memento");
        return new Memento(time);
    }

    public void restoreFromMemento(Memento memento) {
        time = memento.getSavedTime();
        System.out.println("Time restored from Memento: " + time);
    }

}
