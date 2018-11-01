package designPatterns.behavioral.strategy.first;

/**
 * Strategy Design Pattern (also known as the policy pattern) is a behavioral software design pattern that
 * enables selecting an algorithm at runtime. Instead of implementing a single algorithm directly,
 * code receives run-time instructions as to which in a family of algorithms to use.
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context(new Add());
        System.out.println("Sum of  10 and 5 is: " + context.executeStrategy(10, 5));
        context = new Context(new Subrtact());
        System.out.println("Sum of  10 and 5 is: " + context.executeStrategy(10, 5));
        context = new Context(new Multiply());
        System.out.println("Sum of  10 and 5 is: " + context.executeStrategy(10, 5));
    }


}
