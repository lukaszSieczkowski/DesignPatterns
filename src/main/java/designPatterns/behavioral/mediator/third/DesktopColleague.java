package designPatterns.behavioral.mediator.third;

public class DesktopColleague extends Colleague {

    public DesktopColleague(Mediator mediator) {
        super(mediator);
    }

    public void receive(String message) {
        System.out.println("Desktop Received: " + message);
    }
}
