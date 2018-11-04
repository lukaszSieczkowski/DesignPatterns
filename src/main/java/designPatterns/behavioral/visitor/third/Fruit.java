package designPatterns.behavioral.visitor.third;

public class Fruit implements ItemElement {

    private int privePerKg;
    private int weight;
    private String name;

    public Fruit(int privePerKg, int weight, String name) {
        this.privePerKg = privePerKg;
        this.weight = weight;
        this.name = name;
    }

    public int getPrivePerKg() {
        return privePerKg;
    }

    public void setPrivePerKg(int privePerKg) {
        this.privePerKg = privePerKg;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int accept(ShoppingCartVisitor shoppingVisitor) {
      return  shoppingVisitor.visit(this);
    }
}
