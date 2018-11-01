package designPatterns.behavioral.strategy.four;
@FunctionalInterface
public interface CalculationStrategy {

    public int calculate (int num1, int num2);
}
