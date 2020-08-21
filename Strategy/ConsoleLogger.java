package Strategy;

public class ConsoleLogger implements ILogger{

    @Override
    public void write(String message) {
        // TODO Auto-generated method stub
        System.out.println(message);
    }
}