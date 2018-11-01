package designPatterns.behavioral.strategy.third;


import designPatterns.behavioral.strategy.first.Multiply;
import designPatterns.behavioral.strategy.first.Subrtact;

/**
 * Strategy Design Pattern (also known as the policy pattern) is a behavioral software design pattern that
 * enables selecting an algorithm at runtime. Instead of implementing a single algorithm directly,
 * code receives run-time instructions as to which in a family of algorithms to use.
 */
public class Client {

    public static void main(String[] args) {
        Context.ADD.calculate(10,5);
        System.out.println("Sum of  10 and 5 is: " +Context.ADD.calculate(10,5));
        System.out.println("Subtraction of  10 and 5 is: " + Context.SUBTRACT.calculate(10,5));
        System.out.println("Multiplication of  10 and 5 is: " + Context.MULTIPLY.calculate(10,5));
    }

}
