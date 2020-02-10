package Proxy;

import Decorator.Cuenta;

/**
 * ICuenta
 */
public interface ICuenta {
    Cuenta retirarDinero(Cuenta cuenta, double cantidad);
    Cuenta depositarDinero(Cuenta cuenta, double cantidad);
    void mostrarSaldo(Cuenta cuenta);
}