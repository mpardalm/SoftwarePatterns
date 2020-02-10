package Memento;

/**
 * Empty
 */
public class Empty extends Estado{

    @Override
    public void putPieza(Bandeja b, Pieza p) {
        b.addPieza(p);
        b.estado = b.getCapacidad() == 1 ? new Full() : new Normal();
    }

    @Override
    public Pieza getPieza(Bandeja b, Pieza p) {
        throw new RuntimeException("Bandeja Vacia");
    } 
}