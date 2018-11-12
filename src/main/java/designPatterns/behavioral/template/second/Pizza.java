package designPatterns.behavioral.template.second;

public abstract class Pizza {

    public void prepare() {
        prepareCake();
        addTomatoSauce();
        addAdditions();
        addSpices();
        bake();
    }

    private void bake() {
        System.out.println("Bake for 15 minutes...");
    }

    protected abstract void addSpices();

    protected abstract void addAdditions();

    private void addTomatoSauce() {
        System.out.println("Adding tomato sauce...");
    }

    protected abstract void prepareCake();

}
