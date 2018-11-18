package designPatterns.behavioral.decorator.third;

public class Client {
    public static void main(String[] args) {

        IronMan ironMan = new IronMan();
        ironMan.addNewGadget("Unibeam Chest Projector");
        ironMan.addNewGadget("Flight");
        ironMan.showGadget(); }
}


