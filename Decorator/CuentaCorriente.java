package Decorator;

/**
 * CuentaCorriente
 */
public class CuentaCorriente implements ICuentaBancaria{

    @Override
    public void abrirCuenta(Cuenta c) {
        System.out.println("--------------");
        System.out.println("Nueva Cuenta Corriente");
        System.out.println("Cliente: " + c.getCliente());
    }
}