package AbstractFactory;

/**
 * ConexionRestVenta
 */
public class ConexionRestVenta implements IConexionRest {
    @Override
    public void leerURL (String url) {
        System.out.println("Sold in " + url);
    }
}