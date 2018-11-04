package designPatterns.behavioral.visitor.first;


/**
 * The visitor design pattern is a way of separating an algorithm from an object structure on which it operates.
 * A practical result of this separation is the ability to add new operations to existent object structures without
 * modifying the structures. It is one way to follow the open/closed principle
 */
public class Client {

    public static void main(String [] args){
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }

}
