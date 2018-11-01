package designPatterns.behavioral.strategy.second;

import designPatterns.behavioral.strategy.first.Add;
import designPatterns.behavioral.strategy.first.Context;
import designPatterns.behavioral.strategy.first.Multiply;
import designPatterns.behavioral.strategy.first.Subrtact;

/**
 * Strategy Design Pattern (also known as the policy pattern) is a behavioral software design pattern that
 * enables selecting an algorithm at runtime. Instead of implementing a single algorithm directly,
 * code receives run-time instructions as to which in a family of algorithms to use.
 */
public class Client {

    public static void main(String[] args) {
        Person person = new Person(new Phisician(),new Car(),new Workout());
        person.drive();
        person.work();
        person.spendFreeTime();


        person = new Person(new Postman(), new Bike(), new Library());
        person.work();
        person.drive();
        person.spendFreeTime();

    }


}
