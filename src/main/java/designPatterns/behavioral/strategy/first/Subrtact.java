package designPatterns.behavioral.strategy.first;

public class Subrtact implements Strategy
{
    public int doOperation(int num1, int num2) {
        return num1-num2;
    }
}
