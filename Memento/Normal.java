package Memento;

/**
 * Normal
 */
public class Normal extends Estado{

    @Override
    public void putPieza(Bandeja b, Pieza p) {
        b.addPieza(p);
        b.estado = b.size() == b.getCapacidad() ? new Full() : new Normal();
    }

    @Override
    public Pieza getPieza(Bandeja b, Pieza p) {
        b.getPiezas().remove(0);
        b.estado = b.size() == 0 ? new Empty() : new Normal();
        return p;
    }
}