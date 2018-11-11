package designPatterns.behavioral.mediator.third;

public class MobileColleague extends Colleague {

    public MobileColleague(Mediator mediator) {
        super(mediator);
    }

    public void receive(String message) {
        System.out.println("Mobile Received: " + message);
    }
}