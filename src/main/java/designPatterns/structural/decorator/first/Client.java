package designPatterns.structural.decorator.first;

/**
 * The decorator pattern is a design pattern that allows behavior to be added to an individual object,
 * dynamically, without affecting the behavior of other objects from the same class
 */

public class Client {
    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
