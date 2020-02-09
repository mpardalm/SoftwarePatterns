/**
 * ConexionRestCompra
 */
public class ConexionRestCompra implements IConexionRest {
    @Override
    public void leerURL (String url) {
        System.out.println("Conecting to " + url);
    }
}