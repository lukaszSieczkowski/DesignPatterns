package designPatterns.behavioral.state.first;

public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in STOP state");
        context.setState(this);
    }
    public String toString(){
        return "Stop State";
    }
}
