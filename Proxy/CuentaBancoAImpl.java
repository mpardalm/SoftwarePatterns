package Proxy;

import Decorator.Cuenta;

/**
 * CuentaBancoAImpl
 */
public class CuentaBancoAImpl implements ICuenta {

    @Override
    public Cuenta retirarDinero(Cuenta cuenta, double cantidad) {
        double saldoActual = cuenta.getSaldoInicial() - cantidad;
        cuenta.setSaldoInicial(saldoActual);
        System.out.println("Saldo Actual: " + cuenta.getSaldoInicial());
        return cuenta;
    }

    @Override
    public Cuenta depositarDinero(Cuenta cuenta, double cantidad) {
        cuenta.setSaldoInicial(cuenta.getSaldoInicial() + cantidad);
        System.out.println("Saldo Actual: " + cuenta.getSaldoInicial());
        return cuenta;
    }

    @Override
    public void mostrarSaldo(Cuenta cuenta) {
        System.out.println("Saldo Actual: " + cuenta.getSaldoInicial());
    }

    
}