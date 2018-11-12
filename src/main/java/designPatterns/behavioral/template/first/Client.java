package designPatterns.behavioral.template.first;

/**
 * The template method pattern is a behavioral design pattern that defines the program skeleton of an algorithm in an operation,
 * deferring some steps to subclasses.It lets one redefine certain steps of an algorithm without changing the algorithm's
 * structure
 */
public class Client {
    public static void main(String[]agrs) {
        Game game = new BasketBall();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
