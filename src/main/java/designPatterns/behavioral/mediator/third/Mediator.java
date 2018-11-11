package designPatterns.behavioral.mediator.third;

public interface Mediator {
    public void send(String message, Colleague colleague);
}
