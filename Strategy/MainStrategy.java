package Strategy;

public class MainStrategy {
    public static void main(String[] args) {
        ConsoleLogger consoleLogger = new ConsoleLogger();
        ConsoleLoggerDetails consoleLoggerDetails = new ConsoleLoggerDetails();
        MainStrategy mainStrategy = new MainStrategy();
        mainStrategy.run(consoleLogger);
        mainStrategy.run(consoleLoggerDetails);
    }
    public void run (ILogger logger) {
        logger.write("ERROR");
    }
}