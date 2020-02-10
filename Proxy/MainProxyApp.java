package Proxy;

import Decorator.Cuenta;

/**
 * MainProxyApp
 */
public class MainProxyApp {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1, "Mike", 100);

        ICuenta cuentaProxy = new CuentaProxy(new CuentaBancoAImpl());
        cuentaProxy.mostrarSaldo(cuenta);
        cuenta = cuentaProxy.depositarDinero(cuenta, 50);
        cuenta = cuentaProxy.retirarDinero(cuenta, 20);
        cuentaProxy.mostrarSaldo(cuenta);
    }
}