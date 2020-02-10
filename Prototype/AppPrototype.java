package Prototype;

/**
 * AppPrototype
 */
public class AppPrototype {
    public static void main(String[] args) {
        CuentaAhorro cuentaAhorro = new CuentaAhorro();
        cuentaAhorro.setCantidad(200.0);

        CuentaAhorro cuentaAhorroClonada = (CuentaAhorro) cuentaAhorro.clonar();
        System.out.println("Cuenta Original: " + cuentaAhorro.getCantidad());
        System.out.println("Cuenta Clonada: " + cuentaAhorroClonada.getCantidad());
    }
}