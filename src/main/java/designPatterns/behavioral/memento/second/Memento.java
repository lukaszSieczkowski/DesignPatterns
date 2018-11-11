package designPatterns.behavioral.memento.second;

import java.time.LocalTime;

public class Memento {
    private LocalTime time;

    public Memento(LocalTime timeToSave) {
        time = timeToSave;
    }

    public LocalTime getSavedTime() {
        return time;
    }
}

