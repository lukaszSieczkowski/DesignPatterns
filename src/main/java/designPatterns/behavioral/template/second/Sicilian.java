package designPatterns.behavioral.template.second;

public class Sicilian extends Pizza {

    @Override
    protected void addSpices() {
        System.out.println("Adding spices...");
    }

    @Override
    protected void addAdditions() {
        System.out.println("Adding olives and capers...");
    }

    @Override
    protected void prepareCake() {
        System.out.println("Preparing thick cake...");
    }
}
