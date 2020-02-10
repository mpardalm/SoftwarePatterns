package Proxy;

import java.util.logging.Logger;

import Decorator.Cuenta;

/**
 * CuentaProxy
 */
public class CuentaProxy implements ICuenta {

    private ICuenta cuentaReal;
    private final static Logger LOGGER = Logger.getLogger(CuentaProxy.class.getName());

    public CuentaProxy (ICuenta cuentaReal) {
        this.cuentaReal = cuentaReal;
    }

    @Override
    public Cuenta retirarDinero(Cuenta cuenta, double cantidad) {
        LOGGER.info("----Cuenta Proxy - Retirar Dinero----");
        if (cuentaReal == null) {
            cuentaReal = new CuentaBancoAImpl();
        }
        return cuentaReal.retirarDinero(cuenta, cantidad);
    }

    @Override
    public Cuenta depositarDinero(Cuenta cuenta, double cantidad) {
        LOGGER.info("----Cuenta Proxy - Depositar Dinero----");
        if (cuentaReal == null) {
            cuentaReal = new CuentaBancoAImpl();
        }
        return cuentaReal.depositarDinero(cuenta, cantidad);
    }

    @Override
    public void mostrarSaldo(Cuenta cuenta) {
        LOGGER.info("----Cuenta Proxy - Mostrar Dinero----");
        if (cuentaReal == null) {
            cuentaReal = new CuentaBancoAImpl();
        }
        cuentaReal.mostrarSaldo(cuenta);
    }
}