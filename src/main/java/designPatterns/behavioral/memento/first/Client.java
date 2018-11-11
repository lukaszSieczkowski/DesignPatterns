package designPatterns.behavioral.memento.first;

/**
 * The memento pattern is a software design pattern that provides the ability
 * to restore an object to its previous state (undo via rollback).
 */
public class Client {

    public static void main(String[]args ){
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.addState(originator.saveToMemento());

        originator.setState("State #3");
        careTaker.addState(originator.saveToMemento());

        originator.setState("State #4");
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }

}
