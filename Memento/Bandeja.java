package Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Bandeja
 */
public class Bandeja {

    private final Integer capacidad;
    private List<Pieza> piezas = new ArrayList<>();
    public Estado estado;

    public Bandeja (Integer capacidad) {
        this.capacidad = capacidad;
        this.estado = new Empty();
    }

    public void addPieza (Pieza pieza) {
        piezas.add(pieza);
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public List<Pieza> getPiezas() {
        return piezas;
    }

    public void setPiezas(List<Pieza> piezas) {
        this.piezas = piezas;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Integer size () {
        return piezas.size();
    }
}