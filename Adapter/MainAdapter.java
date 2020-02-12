package Adapter;

/**
 * MainAdapter
 */
public class MainAdapter {

    public static void main(String[] args) {
        BombillaModerna bombillaModerna = new BombillaModerna();
        System.out.println(bombillaModerna.encender());
        System.out.println(bombillaModerna.aumentarIntensidad());
        System.out.println(bombillaModerna.apagar());

        BombillaAdapter bombillaAdapter = new BombillaAdapter();
        System.out.println(bombillaAdapter.encender());
        System.out.println(bombillaAdapter.aumentarIntensidad());
        System.out.println(bombillaAdapter.apagar());
    }
}