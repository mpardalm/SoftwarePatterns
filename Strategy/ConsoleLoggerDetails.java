package Strategy;

public class ConsoleLoggerDetails implements ILogger{

    @Override
    public void write(String message) {
        // TODO Auto-generated method stub
        System.out.println("Método más sofisticado para mostrar errores ".concat(message));
    }
    
}