package designPatterns.behavioral.visitor.third;

public interface ShoppingCartVisitor {

    public int visit(Book book);

    public int visit(Fruit book);

}
