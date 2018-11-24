package designPatterns.behavioral.state.first;

public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("player is in START state");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }
}
