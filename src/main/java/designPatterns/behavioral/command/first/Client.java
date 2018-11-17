package designPatterns.behavioral.command.first;

/**
 * The command pattern is a behavioral design pattern in which an object is used to encapsulate all information needed to
 * perform an action or trigger an event at a later time. This information includes the method name,
 * the object that owns the method and values for the method parameters.
 */
public class Client {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
