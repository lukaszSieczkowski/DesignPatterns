package designPatterns.behavioral.mediator.third;

public class Client {
    public static void main(String[] args) {

        MediatorImpl mediator = new MediatorImpl();
        Colleague desktop = new DesktopColleague(mediator);
        Colleague mobile = new MobileColleague(mediator);
        mediator.addColleague(desktop);
        mediator.addColleague(mobile);
        desktop.send("Hello World");
        mobile.send("Hello");
    }
}
