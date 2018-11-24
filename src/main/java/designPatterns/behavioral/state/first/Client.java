package designPatterns.behavioral.state.first;

/**
 * The state pattern is a behavioral software design pattern to allow an object to alter its behavior when its internal
 * state changes. This pattern is close to the concept of Finite-state machine however it is important to keep in mind
 * that this pattern is not a software implementation of Finite-state machine.
 * The state pattern can be interpreted as a strategy pattern which is able to switch the current strategy through
 * invocations of methods defined in the pattern's interface.
 */
public class Client {
    public static void main (String[]args){
        Context context = new Context();
        State startState =  new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        State stopState =  new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
