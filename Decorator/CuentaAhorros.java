/**
 * CuentaAhorro
 */
public class CuentaAhorros implements ICuentaBancaria{

    @Override
    public void abrirCuenta(Cuenta c) {
        System.out.println("--------------");
        System.out.println("Nueva Cuenta de Ahorros");
        System.out.println("Cliente: " + c.getCliente());
    }
}