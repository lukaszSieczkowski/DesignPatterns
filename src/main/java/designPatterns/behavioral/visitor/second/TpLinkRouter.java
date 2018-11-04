package designPatterns.behavioral.visitor.second;

public class TpLinkRouter implements Router {
    @Override
    public void sendData(char[] data) {

    }

    @Override
    public void acceptData(char[] data) {

    }

    @Override
    public void accept(RouterVisitor routerVisitor) {
        routerVisitor.visit(this);
    }
}
