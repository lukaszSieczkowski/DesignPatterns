package designPatterns.behavioral.mediator.third;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator {

    private List<Colleague> colleagues;

    public MediatorImpl() {
        colleagues = new ArrayList<Colleague>();
    }

    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    public void send(String message, Colleague originator) {
        for (Colleague colleague : colleagues) {
            if (colleague != originator) {
                colleague.receive(message);
            }
        }
    }

}