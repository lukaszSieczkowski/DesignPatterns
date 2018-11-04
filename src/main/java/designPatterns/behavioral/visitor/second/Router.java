package designPatterns.behavioral.visitor.second;

public interface Router {

    public void sendData(char[]data);
    public void acceptData(char[] data);
    public void accept(RouterVisitor routerVisitor);
}
