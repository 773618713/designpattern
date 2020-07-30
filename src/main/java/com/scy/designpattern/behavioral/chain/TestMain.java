package com.scy.designpattern.behavioral.chain;

/**
 * 责任链模式
 * 通常每个接收者都包含对另一个接收者的引用。如果一个对象不能处理该请求，那么它会把相同的请求传给下一个接收者，依此类推。
 * 定义了三个级别的日志处理对象，分别是errorLogger（ERROR）-> fileLogger(DEBUG) -> consoleLogger(INFO)。
 * 日志打印，会将日志信息依次传递给三个对象，然后分别进行处理。
 */
public class TestMain {
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

        loggerChain.logMessage(AbstractLogger.INFO, "这是一个日志信息");
        System.out.println();

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "这是一个debug级别的信息");
        System.out.println();

        loggerChain.logMessage(AbstractLogger.ERROR,
                "这是一个error级别的信息");
    }
}
