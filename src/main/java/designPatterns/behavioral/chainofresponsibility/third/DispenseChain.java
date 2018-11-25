package designPatterns.behavioral.chainofresponsibility.third;

public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);
}