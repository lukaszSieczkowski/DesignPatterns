package designPatterns.behavioral.chainofresponsibility.first;

/**
 * The chain-of-responsibility pattern is a design pattern consisting of a source of command objects and a series of processing objects.
 *  Each processing object contains logic that defines the types of command objects that it can handle;
 *  the rest are passed to the next processing object in the chain. A mechanism also exists for adding new processing objects to
 *  the end of this chain. Thus, the chain of responsibility is an object oriented version of
 *  the if ... else if ... else if ....... else ... endif idiom, with the benefit that the condition–action blocks
 *  can be dynamically rearranged and reconfigured at runtime.
 */
public class Client {
    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }
}

