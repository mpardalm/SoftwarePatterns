/**
 * ConexionRESTFabrica
 */
public class ConexionRESTFabrica implements FabricaAbstracta{
    @Override
    public BaseDatosGenerica getDB (String baseDatos) {
        return null;
    }

    @Override
    public IConexionRest getREST (String area) {
        IConexionRest conexionRest = null;
        switch (area) {
            case "COMPRAS":
                conexionRest = new ConexionRestCompra();
                break;
            case "VENTAS":
                conexionRest =  new ConexionRestVenta();
                break;
            default:
                break;
        }

        return conexionRest;
    }
}