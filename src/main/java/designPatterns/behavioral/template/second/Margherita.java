package designPatterns.behavioral.template.second;

public class Margherita extends Pizza {

    @Override
    protected void addSpices() {
        System.out.println("Adding basil and oil...");
    }

    @Override
    protected void addAdditions() {
        System.out.println("Adding mozarella cheese...");
    }

    @Override
    protected void prepareCake() {
        System.out.println("Preparing standard cake...");
    }
}
