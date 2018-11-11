package designPatterns.behavioral.memento.second;

import java.util.ArrayList;
import java.util.List;

public class TimeCareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void addState(Memento state){
        mementoList.add(state);
    }
    public Memento get(int index){
        return mementoList.get(index);
    }
}
