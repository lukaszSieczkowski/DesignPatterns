package designPatterns.behavioral.strategy.four;

public enum CalculationOperation implements CalculationStrategy {

    ADD((num1, num2) -> num1 + num2),
    SUBTRACT((num1, num2) -> num1 - num2),
    MULTIPLY((num1, num2) -> num1 * num2);

    private CalculationStrategy calculationStrategy;

    CalculationOperation(CalculationStrategy calculationStrategy) {
        this.calculationStrategy = calculationStrategy;
    }

    @Override
    public int calculate(int num1, int num2) {
        return calculationStrategy.calculate(num1, num2);
    }

    ;

}
