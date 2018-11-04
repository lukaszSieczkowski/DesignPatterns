package designPatterns.behavioral.visitor.third;

    public interface ItemElement {

        public int accept(ShoppingCartVisitor shoppingVisitor);
}
