package Memento;

/**
 * Full
 */
public class Full extends Estado{

    @Override
    public void putPieza(Bandeja b, Pieza p) {
        throw new RuntimeException("Bandeja Llena");
    }

    @Override
    public Pieza getPieza(Bandeja b, Pieza p) {
        b.getPiezas().remove(0);
        b.estado = b.size() == 0 ? new Empty() : new Normal();
        return p;
    }

    
}