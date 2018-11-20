package designPatterns.structural.decorator.third;


public class IronMan {

    Gadget gadget = new Suit();

    public void addNewGadget(String gadgetName) {
        if (gadgetName.equals("Flight")) {
            this.gadget = new FlightGadget(gadget);
        } else {
            this.gadget = new UnibeamChestProjectorGadget(gadget);
        }
    }

    public void showGadget() {
        System.out.println("My Gadgets:");
        gadget.showGadget();
    }
}


