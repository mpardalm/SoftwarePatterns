package Adapter;

/**
 * BombillaAdapter
 */
public class BombillaAdapter extends Bombilla {

    Vela vela = new Vela();

    @Override
    public String encender() {
        // TODO Auto-generated method stub
        return vela.prenderFuego();
    }

    @Override
    public String apagar() {
        // TODO Auto-generated method stub
        return vela.apagarFuego();
    }

    @Override
    public String aumentarIntensidad() {
        // TODO Auto-generated method stub
        return vela.aumentarFuego();
    }

}