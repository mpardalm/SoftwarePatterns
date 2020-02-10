package Memento;

/**
 * Estado
 */
public abstract class Estado {
    public abstract void putPieza(Bandeja b, Pieza p);
    public abstract Pieza getPieza(Bandeja b, Pieza p);
}