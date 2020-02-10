package Prototype;

/**
 * CuentaAhorro
 */
public class CuentaAhorro implements ICuenta {

    private String nombre;
    private double cantidad;

    public CuentaAhorro() {
        this.nombre = "AHORRO";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public ICuenta clonar() {
        CuentaAhorro cuentaAhorro = null;

        try {
            cuentaAhorro = (CuentaAhorro) clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return cuentaAhorro;
    }

    
}