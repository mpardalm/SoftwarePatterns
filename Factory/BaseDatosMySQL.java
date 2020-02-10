package Factory;

/**
 * BaseDatosMySQL
 */
public class BaseDatosMySQL implements BaseDatosGenerica {

    @Override
    public String cadenaConexion() {
        return "Conexión a MySQL";
    }
}