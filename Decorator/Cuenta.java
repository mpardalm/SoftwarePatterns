package Decorator;

/**
 * Cuenta
 */
public class Cuenta {

    private int id;
    private String cliente;
    private double saldoInicial;

    public Cuenta() {

    }

    public Cuenta(int id, String cliente) {
        this.id = id;
        this.cliente = cliente;
    }

    public Cuenta(int id, String cliente, double saldoInicial) {
        this.id = id;
        this.cliente = cliente;
        this.saldoInicial = saldoInicial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }
}