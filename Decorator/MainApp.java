package Decorator;

/**
 * MainApp
 */
public class MainApp {
    public static void main(String[] args) {
        Cuenta c = new Cuenta(1, "Mike");

        ICuentaBancaria cuenta = new CuentaAhorros();
        ICuentaBancaria cuentaBlindada = new BlindajeDecorador(cuenta);

        cuentaBlindada.abrirCuenta(c);
    }
}