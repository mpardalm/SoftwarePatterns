package Memento;

/**
 * MainMementoApp
 */
public class MainMementoApp {

    public static void main(String[] args) {
        Bandeja bandeja = new Bandeja(2);
        Pieza pieza = new Pieza(bandeja);
        System.out.println(bandeja.estado);
        bandeja.estado.putPieza(bandeja, pieza);
        bandeja.estado.putPieza(bandeja, pieza);
        System.out.println(bandeja.estado);
        bandeja.estado.getPieza(bandeja, pieza);
        System.out.println(bandeja.estado);
    }
}