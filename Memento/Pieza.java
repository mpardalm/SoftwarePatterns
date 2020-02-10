package Memento;

/**
 * Pieza
 */
public class Pieza {

    private Bandeja bandeja;

    public Pieza (Bandeja b) {
        this.bandeja = b;
    }

    public Bandeja getBandeja(){
        return bandeja;
    }
}