package designPatterns.behavioral.observer.third;

import java.util.ArrayList;

public class Lotto implements Observable{

    private ArrayList<Observer> observators;
    private int[] results;

    public Lotto() {
        observators = new ArrayList<Observer>();
        results = new int[]{0, 0, 0, 0, 0, 0};
    }

    public void addObserver(Observer o) {
        observators.add(o);
    }


    public void removeObserver(Observer o) {
        int index = observators.indexOf(o);
        observators.remove(index);
    }

    public void updateObservers() {
        for (Observer o : observators) {
            o.update(results);
        }
    }

    public void drav() {
        int i = 0;
        while (i < 6) {
            boolean repeat = false;
            double x = (Math.random() * 47 - 1);
            for (int j = 0; j < 6; j++) {
                if (results[j] == (int) x) {
                    repeat = true;
                }
            }
            if (repeat == false) {
                results[i++] = (int) x;
            }
        }
        updateObservers();
    }

    public int[] getResults() {
        return results;
    }
}
